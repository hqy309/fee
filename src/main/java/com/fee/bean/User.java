package com.fee.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Mars on 2017/8/16.
 */

@JsonIgnoreProperties(ignoreUnknown=true)
public class User {

    private String name;
    private String blog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", blog=" + blog + "]";
    }

}