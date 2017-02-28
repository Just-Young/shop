package org.justYoung.shop.model;

/**
 * Created by Administrator on 2017/2/24.
 */

public class User {
    private int id;
    private String name;
    private String password;
    private String revieve_adress;

    public User(){}

    public User(String name, String password, String revieve_adress) {
        this.name = name;
        this.password = password;
        this.revieve_adress = revieve_adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", revieve_adress='" + revieve_adress + '\'' +
                '}';
    }
}