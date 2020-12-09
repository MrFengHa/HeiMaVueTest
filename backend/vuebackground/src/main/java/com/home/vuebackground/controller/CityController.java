package com.home.vuebackground.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/12/9 9:58
 */
@RestController
@RequestMapping("city")
public class CityController {
    @CrossOrigin
    @GetMapping("find")
    public Map<String, String> findWeatherByCity(String name) {
        Map<String, String> map = new HashMap<>();
        String weathers = getWeathers(name);
        System.out.println(name);
        map.put("message", weathers);
        return map;
    }

    /**
     * 返回对应城市的天气
     * @param name
     * @return
     */
    public String getWeathers(String name) {
        Map<String, String> weathers = new HashMap<>();
        weathers.put("北京", "晴转多云,空气清新");
        weathers.put("上海", "多云转晴,空气良");
        weathers.put("广州", "中到暴雨,空气好");
        weathers.put("深圳", "晴天,空气差");
        weathers.put("长春", "阴,空气良");
        return weathers.get(name);
    }
}
