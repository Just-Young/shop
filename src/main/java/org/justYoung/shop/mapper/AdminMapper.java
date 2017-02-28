package org.justYoung.shop.mapper;

import org.justYoung.shop.model.Admin;

/**
 * Created by Administrator on 2017/2/27.
 */
public interface AdminMapper {
    void add(Admin admin);
    Admin load(int id);
}
