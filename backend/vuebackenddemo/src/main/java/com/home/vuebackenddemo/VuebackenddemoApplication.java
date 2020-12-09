package com.home.vuebackenddemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.home.vuebackenddemo.mapper")
public class VuebackenddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VuebackenddemoApplication.class, args);
    }

}
