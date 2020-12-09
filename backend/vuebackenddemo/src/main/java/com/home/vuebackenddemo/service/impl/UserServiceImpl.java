package com.home.vuebackenddemo.service.impl;

import com.home.vuebackenddemo.entity.User;
import com.home.vuebackenddemo.mapper.UserMapper;
import com.home.vuebackenddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * 文件描述
 *
 * @author 冯根源
 * @date 2020/12/9 22:54
 */
@Service
@Transactional //控制事务
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有方法
     *
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        return userMapper.findAll();
    }

    /**
     * 保存用户
     *
     * @param user
     */
    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString());
        userMapper.save(user);
    }

    @Override
    public void delete(String id) {
        userMapper.delete(id);
    }
}
