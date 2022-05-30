package util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCConnection {

    private static Connection conn = null;

    public static Connection getConnection(){

         if (conn == null){
//            Establish a new Connection
//            String endpoint = "localhost";
//            String database = "project2";
//            String url = "jdbc:postgresql://" + endpoint + "/" + database;
//            String username = "postgres";
//            String password = "admin27";


            try {
//                FileInputStream input = new FileInputStream("src/main/resources/connection.properties");
                FileInputStream input = new FileInputStream(JDBCConnection.class.getClassLoader().getResource("connection.properties").getFile());
                InputStream input2 = JDBCConnection.class.getClassLoader().getResourceAsStream("connection.properties");

                Properties props = new Properties();
                props.load(input2);

                String endpoint = props.getProperty("endpoint");
                String database = props.getProperty("database");
                String url = "jdbc:postgresql://" + endpoint + "/" + database;
                String username = props.getProperty("username");
                String password = props.getProperty("password");


                conn = DriverManager.getConnection(url, username, password);
            }catch (Exception e) {
                e.printStackTrace();
            }

        }

        return conn;

    }

    public static void main(String[] args) {

        Connection conn1 = getConnection();
        Connection conn2 = getConnection();

        System.out.println(conn1);
        System.out.println(conn2);
    }
}
