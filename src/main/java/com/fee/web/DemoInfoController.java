package com.fee.web;

import com.fee.bean.DemoInfo;
import com.fee.service.DemoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Mars on 2017/8/7.
 */

@Controller
public class DemoInfoController {
    @Autowired
    DemoInfoService demoInfoService;


    @RequestMapping("/test")
    public@ResponseBody String test(){
        System.out.println("---------start----------------");

        DemoInfo loaded = demoInfoService.findById(1);
        System.out.println("loaded="+loaded);
        DemoInfo cached = demoInfoService.findById(1);
        System.out.println("cached="+cached);
        loaded = demoInfoService.findById(2);
        System.out.println("loaded2="+loaded);
        System.out.println("---------end----------------");
        return"ok";
    }

    @ResponseBody
    @RequestMapping("/test2")
    public String test2() {
        System.out.println("---------start----------------");

        DemoInfo loaded = demoInfoService.findById(1);
        System.out.println("loaded="+loaded);
        loaded.setName("pppffff");
        demoInfoService.save(loaded);
        DemoInfo loaded2 = demoInfoService.findById(1);
        System.out.println("loaded2="+loaded2);
        System.out.println("---------end----------------");

        return"ok";
    }

    @ResponseBody
    @RequestMapping("/modify")
    public String modify() {
        System.out.println("-----modify----start----------------");

        DemoInfo loaded3 = demoInfoService.findById(1);
        System.out.println("loaded3="+loaded3);
        loaded3.setPwd("3333modify");
        demoInfoService.save(loaded3);
        System.out.println("-------modify--end----------------");
        return"ok";
    }

    @RequestMapping("/delete")
    public@ResponseBody String delete(long id){
        demoInfoService.deleteFromCache(id);
        return"ok";
    }

    @RequestMapping("/test1")
    public@ResponseBody String test1(){
        demoInfoService.test();
        System.out.println("DemoInfoController.test1()");
        return"ok";
    }

    @RequestMapping("/save")
    public@ResponseBody String save(){
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setName("aste");
        demoInfo.setPwd("asdfasdfasdf");
        demoInfoService.save(demoInfo);
        System.out.println("DemoInfoController.test1()");
        return"ok";
    }

    @RequestMapping("/save2")
    public@ResponseBody String save2(){
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setName("aste");
        demoInfo.setPwd("asdfasdfasdf");
        demoInfoService.save2(demoInfo);
        System.out.println("DemoInfoController.test1()");
        return"ok";
    }



}
