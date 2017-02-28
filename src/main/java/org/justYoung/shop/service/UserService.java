package org.justYoung.shop.service;

import org.justYoung.shop.dao.IUserDao;
import org.justYoung.shop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User load(int id) {
        return userDao.load(id);
    }

    @Override
    public List<User> loginlist() {
        return userDao.list();
    }
}

