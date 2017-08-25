package com.fee.web;

import com.fee.bean.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mars on 2017/8/4.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/getDemo")
    public Demo getDemo() {
        Demo d = new Demo();
        d.setId(1L);
        d.setName("Mars");
        return d;
    }


    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }
}
