package org.justYoung.shop.service;

import org.justYoung.shop.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */
public interface IUserService {
    void add(User user);
    User load(int id);
    List<User> loginlist();
    User login(String username,String password);
    boolean checkByUname(String username);//这个是注册时检查用户名是否一致的方法

}
