package org.justYoung.shop.dao;

import org.justYoung.shop.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */
public interface IUserDao {
    void add(User user);
    User load(int id);
    List<User> list();


}