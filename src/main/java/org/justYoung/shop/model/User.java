package org.justYoung.shop.model;

/**
 * Created by Administrator on 2017/2/24.
 */

public class User {
    private int id;
    private String username;
    private String password;
    private String revieve_adress;
    private long phone;
    private String email;
//    private String created;
//    private String updated;
    public User(){}

    public User(int id, String username, String password, String revieve_adress, long phone, String email, String created, String updated) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.revieve_adress = revieve_adress;
        this.phone = phone;
        this.email = email;
//        this.created = created;
//        this.updated = updated;
    }

    public User(int id, String username, String password, long phone, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRevieve_adress() {
        return revieve_adress;
    }

    public void setRevieve_adress(String revieve_adress) {
        this.revieve_adress = revieve_adress;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", revieve_adress='" + revieve_adress + '\'' +
                '}';
    }
}