package com.example.controller;
import com.example.domain.City;
import com.example.mapper.CityMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by jianzhongli on 15/11/21.
 */
@RestController
public class TestController {

    @Resource
    private CityMapper cityMapper;

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/mybatis/query")
    City queryByMybatis(){
        City city = cityMapper.findByState("CA");
        if(city == null){
            return null;
        }

        return city;
    }
}
