package com.home.vuebackenddemo.mapper;

import com.home.vuebackenddemo.entity.User;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 保存用户
     * @param user
     */
    void save(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    void delete(String id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findUserById(String id);

    /**
     * 修改用户信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 模糊查询
     * @param name
     * @param phoneCode
     * @return
     */
    List<User> findNameOrPhoneCode(@Param("name")String name,@Param("phoneCode") String phoneCode);
}
