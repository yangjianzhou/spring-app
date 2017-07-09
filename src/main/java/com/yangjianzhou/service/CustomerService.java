package com.yangjianzhou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Created by yangjianzhou on 16-7-2.
 */

@Service
@Lazy
public class CustomerService {

    @Autowired
    private ProductService productService ;

    private int age = 123 ;

    private String name ;


    public void setName(){
        this.name = "ctgu";
    }
}
