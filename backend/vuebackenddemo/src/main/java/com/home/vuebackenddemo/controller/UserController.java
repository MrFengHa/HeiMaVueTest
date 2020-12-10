package com.home.vuebackenddemo.controller;

import com.home.vuebackenddemo.entity.User;
import com.home.vuebackenddemo.service.UserService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文件描述
 *
 * @author 冯根源
 * @date 2020/12/9 22:58
 */
@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     *
     * @return
     */
    @GetMapping("findAll")
    public List<User> findAll() {
        List<User> userList = userService.findAll();
        return userList;
    }

    /**
     * 查询所有用户
     *
     * @return
     */

    @PostMapping("save")
    public Map<String, Object> save(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        try {
            System.out.println(StringUtils.isNullOrEmpty(user.getId()));
            if (StringUtils.isNullOrEmpty(user.getId())){
               userService.save(user);
            }else {
                userService.updateUser(user);
            }

            map.put("success", true);
        } catch (Exception e) {
            map.put("success", false);
            map.put("message", "用户保存更新失败");
        }

        return map;
    }

    @PostMapping("delete")
    public Map<String, Object> delete(String id) {
        Map<String, Object> map = new HashMap<>();
        try {
            System.out.println(id);
            userService.delete(id);
            map.put("success", true);
        } catch (Exception e) {
            map.put("success", false);
            map.put("message", "删除用户失败");
        }
        return map;
    }

    @GetMapping("findUserById")
    public User findUserById(String id) {
        User user = userService.findUserById(id);
        return user;
    }

    /**
     * 模糊查询
     * @param name
     * @param phoneCode
     * @return
     */
    @GetMapping("findLike")
    public List<User> findNameOrPhoneCode(String name,String  phoneCode){
        return userService.findNameOrPhoneCode(name,phoneCode);
    }


}
