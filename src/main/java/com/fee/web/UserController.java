package com.fee.web;

import com.fee.bean.Demo;
import com.fee.bean.UserBean;
import com.fee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mars on 2017/8/24.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    /**
     * 测试保存数据方法.
     *
     * @return
     */
    @RequestMapping("/save")
    public String save() {
        UserBean d = new UserBean();
        d.setAccount("Angel");
        d.setPassword("apsss");
        d.setUsername("ggl");
//        userService.insertUser(d);//保存数据.
        return "ok.Demo2Controller.save";
    }

    @RequestMapping("/selectUserById/{id}")
    public UserBean selectUserById(@PathVariable int id) throws Exception {
        return userService.selectUserById(id);
    }

}
