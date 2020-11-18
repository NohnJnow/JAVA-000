package com.wyh.uploadBean.Beans;

import org.springframework.stereotype.Component;

/**
 * @author Wu YuHao thecoco
 * @date 2020/11/18 3:58 下午
 */
@Component
public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
