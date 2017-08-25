package com.fee.web;

import com.fee.bean.Demo;
import com.fee.service.DemoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Mars on 2017/8/4.
 */
@Controller
public class HelloController {

    // 从 application.properties 中读取配置，如取不到默认值为Hello
    @Value("${application.hello:Hello}")
    private String hello;

    @ResponseBody
    @RequestMapping("/")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String, Object> map) {
        System.out.println("HelloController.helloJsp().hello=" + hello);
        map.put("hello", hello);
        return "helloJsp";
    }


    @Autowired
    private DemoService demoService;

    @ResponseBody
    @RequestMapping("/likeName")
    public List<Demo> likeName(String name){
        PageHelper.startPage(1,2);
        return demoService.likeName(name);
    }

    @RequestMapping("/save1")
    @ResponseBody
    public String save1() {
        Demo d = new Demo();
        d.setName("Ange2");
        demoService.save(d);//保存数据.
        return "ok.Demo2Controller.save";
    }


}
