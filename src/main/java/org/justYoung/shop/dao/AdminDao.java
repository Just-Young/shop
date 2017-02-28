package org.justYoung.shop.dao;

import org.justYoung.shop.mapper.AdminMapper;
import org.justYoung.shop.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/2/27.
 */
@Repository
public class AdminDao implements IAdminDao {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void add(Admin admin) {

    }

    @Override
    public Admin load(int id) {
        return adminMapper.load(id);
    }
}
