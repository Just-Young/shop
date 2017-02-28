package org.justYoung.shop.service;

import org.justYoung.shop.model.Admin;

/**
 * Created by Administrator on 2017/2/27.
 */
public interface IAdminService{
        void add(Admin admin);
        Admin load(int id);
}
