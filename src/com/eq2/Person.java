package com.eq2;

import java.io.*;

/**
 * @Auther: szp
 * @Date: 2019/12/9 21:19
 * @Description: 沈泽鹏写点注释吧
 */
public class Person {
    private Integer id;
    private String username;
    private String age;
    private String sex;
    //妈妈或者儿子
    private String member;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }


}
