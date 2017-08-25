package com.fee.service.impl;

import com.fee.bean.UserBean;
import com.fee.mapper.UserMapper;
import com.fee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mars on 2017/8/24.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    /*  @Override
      public int insertUser(UserBean userBean)  {
          try {
              return userMapper.insertUser(userBean);
          } catch (Exception e) {
              e.printStackTrace();
          }
          return 0;
      }
  */
    @Override
    public UserBean selectUserById(int id) throws Exception {
        return userMapper.selectUserById(id);
    }
}
