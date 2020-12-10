package com.home.vuebackenddemo.service;

import com.home.vuebackenddemo.entity.User;

import java.util.List;

/**
 * 文件描述
 *
 * @author 冯根源
 * @date 2020/12/9 22:53
 */
public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    void save(User user);

    /**
     * 根据id删除用户细信息
     * @param id
     */
    void delete(String id);

    /**
     * 根据id查询User
     * @param id
     * @return
     */
    User findUserById(String id);

    /**
     * 修改用户
     * @param user
     */
    void updateUser(User user);
}
