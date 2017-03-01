package org.justYoung.shop.service;

import org.justYoung.shop.dao.IUserDao;
import org.justYoung.shop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public User login(String username, String password) {
        Map<String,Object> params = new HashMap();
        params.put("username",username);
        params.put("password",password);
        User user = userDao.getUserByParam(params);
        return user;
    }

    @Override
    public boolean checkByUname(String username) {
        Map<String,Object> params = new HashMap();
        params.put("username",username);
        User user = userDao.getUserByParam(params);
        if(user!=null)
            return true;
        return false;
    }


}

