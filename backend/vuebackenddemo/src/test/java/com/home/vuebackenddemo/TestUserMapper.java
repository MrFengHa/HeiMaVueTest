package com.home.vuebackenddemo;

import com.home.vuebackenddemo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 文件描述
 *
 * @author 冯根源
 * @date 2020/12/9 22:31
 */
@SpringBootTest(classes = VuebackenddemoApplication.class)
@RunWith(SpringRunner.class)
public class TestUserMapper {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindAll(){
        userMapper.findAll().forEach(user-> System.out.println("user ="+user));
    }
}
