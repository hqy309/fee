package com.fee.mapper;/**
 * Created by Mars on 2017/8/15.
 */

import com.fee.bean.Demo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Mars on 2017/8/15.
 */
public interface DemoMapper {

    @Select("select * from Demo where name like CONCAT('%',#{name},'%')")
    public List<Demo> likeName(String name);

    @Select("select *from Demo where id = #{id}")
    public Demo getById(long id);

    @Select("select name from Demo where id = #{id}")
    public String getNameById(long id);







}
