package com.karas.skeleton.account.entity;

import com.karas.skeleton.common.BaseEntity;

/**
 * Created by karasying on 2016/10/27.
 */
public class User extends BaseEntity {


    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
