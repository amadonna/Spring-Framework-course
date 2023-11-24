package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "context.xml"
        );
        TestBean bean = context.getBean("testBean", TestBean.class);
        System.out.println(bean.getName());
        context.close();
    }
}
