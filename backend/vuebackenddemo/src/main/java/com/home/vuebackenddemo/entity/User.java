package com.home.vuebackenddemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/12/9 18:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class User {
    private String id;
    private String name;
    private Integer age;
    private Double salary;
    private String phoneCode;
}
