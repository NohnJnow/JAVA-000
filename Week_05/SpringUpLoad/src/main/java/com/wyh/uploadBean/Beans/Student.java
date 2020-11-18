package com.wyh.uploadBean.Beans;

/**
 * @author Wu YuHao thecoco
 * @date 2020/11/18 4:23 下午
 */

public class Student {
    private String name;
    private String className;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
