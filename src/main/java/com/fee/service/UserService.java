package com.fee.service;

import com.fee.bean.UserBean;

/**
 * Created by Mars on 2017/8/24.
 */
public interface UserService {
//    int insertUser(UserBean userBean);

    UserBean selectUserById(int id) throws Exception;
}
