package com.fee.bean;


/**
 * Created by Mars on 2017/8/10.
 */

class LombokDemo {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        LombokDemo lombokDemo = new LombokDemo();

    }
}
