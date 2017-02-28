package org.justYoung.shop.mapper;

import org.justYoung.shop.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */
public interface UserMapper {
    void add(User user);
    User load(int id);
    List<User> list();
    void addregist(String username,String password,String repassword,long phone,String email);
}
