package com.atguigu.atcrowdfunding.bean;

public class Role {
    private Integer id;
//这是检出
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
//sdasd
    int i ;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}