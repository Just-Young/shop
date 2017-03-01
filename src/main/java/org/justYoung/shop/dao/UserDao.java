package org.justYoung.shop.dao;

import org.justYoung.shop.mapper.UserMapper;
import org.justYoung.shop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/24.
 */
@Repository
public class UserDao implements IUserDao {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public User load(int id) {
        return userMapper.load(id);
    }

    @Override
    public List<User> list() {
        List<User> lists = userMapper.list();
        return lists;
    }

    @Override
    public User getUserByParam(Map<String, Object> params) {
        return userMapper.getUserByParam(params);
    }


}
