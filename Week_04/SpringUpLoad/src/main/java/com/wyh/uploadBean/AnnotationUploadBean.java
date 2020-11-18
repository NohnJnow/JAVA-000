package com.wyh.uploadBean;

import com.wyh.uploadBean.Beans.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author Wu YuHao thecoco
 * @date 2020/11/18 3:57 下午
 */
@Import(User.class)
public class AnnotationUploadBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(User.class);
        context.refresh();
        User user = context.getBean(User.class);
        user.setId(1);
        user.setName("wyh");
        System.out.println(user);
    }
}
