package com.muhammet.step6_springframework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        Printer printer = beanFactory.getBean("printerBean", Printer.class);
        printer.print();

    }
}
