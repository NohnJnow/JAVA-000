package com.wyh.uploadBean;

import com.wyh.uploadBean.Beans.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wu YuHao thecoco
 * @date 2020/11/18 3:57 下午
 */
public class XMLUploadBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = (Student)applicationContext.getBean("Student");

        System.out.println(student);

    }
}
