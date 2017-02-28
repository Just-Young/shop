package org.justYoung.shop.model;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Admin {
    //管理员ID
    private int id;
    //管理员用户名
    private String name;
    //管理员密码
    private String password;
    //发货地址
    private String send_address;

    public Admin(){}

    public Admin(String name, String password, String send_address) {
        this.name = name;
        this.password = password;
        this.send_address = send_address;
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

    public String getSend_address() {
        return send_address;
    }

    public void setSend_address(String send_address) {
        this.send_address = send_address;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", send_address='" + send_address + '\'' +
                '}';
    }
}
