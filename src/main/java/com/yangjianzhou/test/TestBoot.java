package com.yangjianzhou.test;

import com.yangjianzhou.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangjianzhou on 16-7-2.
 */
public class TestBoot {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService)context.getBean("customerService");
        customerService.printProduct();
        System.out.println("this is a test");
    }
}
