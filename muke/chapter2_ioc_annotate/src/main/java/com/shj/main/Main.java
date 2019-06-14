package com.shj.main;

import com.shj.pojo.BeInjectClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @create 2019/6/14
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        BeInjectClass beInjectClass = (BeInjectClass)context.getBean("beInjectClass");
        System.out.println(beInjectClass.toString());
    }

}
