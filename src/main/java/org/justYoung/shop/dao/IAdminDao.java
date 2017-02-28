package org.justYoung.shop.dao;

import org.justYoung.shop.model.Admin;

/**
 * Created by Administrator on 2017/2/27.
 */
public interface IAdminDao {
    public void add(Admin admin);
    public Admin load(int id);
}
