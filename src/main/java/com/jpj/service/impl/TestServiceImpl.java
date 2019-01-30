package com.jpj.service.impl;

import com.jpj.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Author: jingpj
 * @Date：creste in 2019/1/30
 */
//@Service
public class TestServiceImpl implements TestService{
    public String testMethod() {
        return "我是测试的bean";
    }
}
