package com.fee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mars on 2017/8/4.
 */
@SpringBootApplication

@RestController
@EnableScheduling
@ServletComponentScan
@MapperScan("com.fee.mapper")
public class App {

   /* @RequestMapping("/")
    public String hello() {
        return "hello world";
    }*/


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
