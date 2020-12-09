package com.home.vuebackenddemo.mapper;

import com.home.vuebackenddemo.entity.User;

import java.util.List;

/**
 * 文件描述
 *
 * @author 冯根源
 * @date 2020/12/9 22:23
 */
public interface UserMapper {
    /**
     * 查询所有user对象
     * @return
     */
    List<User> findAll();
}
