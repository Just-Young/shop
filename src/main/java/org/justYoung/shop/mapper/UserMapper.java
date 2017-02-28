package org.justYoung.shop.mapper;

import org.justYoung.shop.model.User;

/**
 * Created by Administrator on 2017/2/24.
 */
public interface UserMapper {
    void add(User user);
    User load(int id);
}
