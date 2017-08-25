package com.fee.mapper;

import com.fee.bean.UserBean;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Mars on 2017/8/24.
 */
public interface UserMapper {


    @Select(" select * from t_user where id=#{id}")
    @Results({
            @Result(id=true,property="id",column="id",javaType=int.class),
            @Result(property="username",column="username",javaType=String.class),
            @Result(property="password",column="password",javaType=String.class),
            @Result(property="account",column="account",javaType=String.class)
    })
    public UserBean selectUserById(int id) throws Exception;



}