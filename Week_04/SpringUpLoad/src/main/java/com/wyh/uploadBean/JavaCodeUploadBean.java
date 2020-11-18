package com.wyh.uploadBean;

import com.sun.tools.javah.Gen;
import com.wyh.uploadBean.Beans.Student;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author Wu YuHao thecoco
 * @date 2020/11/18 3:52 下午
 */
public class JavaCodeUploadBean {
    public static void main(String[] args) {
        GenNewBean genNewBean = new GenNewBean();
        Student student = genNewBean.initDotaHero();
        student.setName("wyh");
        student.setClassName("Maath");
        System.out.println(student);
    }
}

class GenNewBean {
    public Student initDotaHero() {
        return new Student();
    }
}
