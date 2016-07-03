package com.yangjianzhou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangjianzhou on 16-7-2.
 */

@Service
public class CustomerService {

    @Autowired
    private ProductService productService ;

    public void  printProduct(){
        productService.getProductDetail();
    }
}
