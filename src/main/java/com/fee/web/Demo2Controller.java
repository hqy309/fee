package com.fee.web;

import com.fee.bean.Demo;
import com.fee.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Mars on 2017/8/4.
 */
@RestController
@RequestMapping("/demo2")
public class Demo2Controller {
    @Resource
    private DemoService demoService;

    /**
     * 测试保存数据方法.
     *
     * @return
     */
    @RequestMapping("/save")
    public String save() {
        Demo d = new Demo();
        d.setName("Angel");
        demoService.save(d);//保存数据.
        return "ok.Demo2Controller.save";
    }

    //地址：http://127.0.0.1:8080/demo2/getById?id=1
    @RequestMapping("/getById")
    public Demo getById(Long id) {
        return demoService.getById(id);
    }

}
