package models;
import java.sql.Date;

import java.util.Objects;

public class Users {

    private int userId;
    private String name;
    private String email;
    private String birthDate;
    private String password;

    public Users() {
    }

    public Users(int userId, String name, String email, String birthDate, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.password = password;
    }

    public Users(int i) {
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() { return birthDate; }


    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return getUserId() == users.getUserId() && getBirthDate() == users.getBirthDate() && getName().equals(users.getName()) && getEmail().equals(users.getEmail()) && getPassword().equals(users.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getName(), getEmail(), getBirthDate(), getPassword());
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", password='" + password + '\'' +
                '}';
    }
}
