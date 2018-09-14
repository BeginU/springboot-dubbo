package com.example.model;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author xieming
 * @version 1.0
 * @create 2018-09-04 15:40
 **/
public class UserDto implements Serializable {
    /**id**/
    private Integer id;
    /**name**/
    private String name;
    /**password**/
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
