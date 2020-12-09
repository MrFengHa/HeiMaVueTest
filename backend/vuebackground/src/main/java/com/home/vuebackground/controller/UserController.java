package com.home.vuebackground.controller;

import com.home.vuebackground.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/12/8 17:06
 */
@RestController
@RequestMapping("user")
public class UserController {
    @CrossOrigin
    @RequestMapping("save")
    public String save(@RequestBody User user){
        System.out.println(user);
        return "成功";
    }
    @CrossOrigin
    @RequestMapping("findAll")
    public List<User> findAll(){
        List<User> users = new ArrayList<>();
        users.add(new User(01,"三宝","110917956@qq.com",12,"135103221153"));
        users.add(new User(02,"素素","456292272@qq.com",31,"135103221153"));
        users.add(new User(03,"打爆","125671684@qq.com",23,"135103221153"));
        return users;
    }
}
