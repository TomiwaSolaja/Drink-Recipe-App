package repositories;

import models.Users;
import util.JDBCConnection;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersRepoImpl implements UsersRepo {

    public static Connection conn = JDBCConnection.getConnection();


    @Override
    public Users getUsers(int id) {

        String sql = "SELECT * FROM users WHERE user_id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return buildUser(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    @Override
    public List<Users> getAllUsers() {

        String sql = "SELECT * FROM users";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            List<Users> users = new ArrayList<>();

            while (rs.next()) {

                users.add(buildUser(rs));
            }

            return users;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }


    @Override
    public Users addUser(Users u) {

        String sql = "INSERT INTO users VALUES (DEFAULT,?,?,?,?) RETURNING *";

        try {
            PreparedStatement ps =conn.prepareStatement(sql);

            ps.setString(1, u.getName());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getBirthDate());
            ps.setString(4, u.getPassword());

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                return buildUser(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Users updateUser(Users change) {
        return null;
    }

    @Override
    public Users deleteUser(int id) {
        return null;
    }



    private Users buildUser(ResultSet rs) throws SQLException {
        Users u = new Users();
        u.setUserId(rs.getInt("user_id"));
        u.setName(rs.getString("name"));
        u.setEmail(rs.getString("email"));
        u.setBirthDate(rs.getString("birth_date"));
        u.setPassword(rs.getString("password"));

        return u;

    }

}
