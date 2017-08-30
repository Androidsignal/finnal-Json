package com.example.akshar.new_large;

/**
 * Created by Akshar on 8/30/2017.
 */

public class MyBean {
    @Override
    public String toString() {
        return "MyBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", home='" + home + '\'' +
                '}';
    }

    public String id,name,mobile,home;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
