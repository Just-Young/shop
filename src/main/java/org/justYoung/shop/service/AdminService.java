package org.justYoung.shop.service;

import org.justYoung.shop.dao.IAdminDao;
import org.justYoung.shop.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/27.
 */
@Service
public class AdminService implements IAdminService {
    @Autowired
    private IAdminDao adminDao;

    @Override
    public void add(Admin admin) {

    }

    @Override
    public Admin load(int id) {
        return adminDao.load(id);
    }
}
