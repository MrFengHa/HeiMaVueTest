package com.home.vuebackground.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/12/8 17:12
 */
@Data
@Accessors(chain = true)
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String email;
    private int age;
    private String phone;


}
