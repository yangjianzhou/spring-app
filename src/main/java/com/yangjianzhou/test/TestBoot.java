package com.yangjianzhou.test;

import com.yangjianzhou.service.CustomerService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by yangjianzhou on 16-7-2.
 */
public class TestBoot {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService)context.getBean("customerService");
        System.out.println("this is a test");
    }

    public static void loadXmlBean(){
        /**
         * 创建资源
         */
        ClassPathResource resource = new ClassPathResource("");
        /**
         * 创建BeanFactory
         */
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        /**
         * 创建读取器
         */
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        /**
         * 加载和注册bean
         */
        reader.loadBeanDefinitions(resource);
    }
}
