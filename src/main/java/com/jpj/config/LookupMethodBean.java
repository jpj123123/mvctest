package com.jpj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: jingpj
 * @Date：creste in 2019/1/30
 */
@Configuration
public class LookupMethodBean {

    @Bean(name="stringBean")
    public String stringBean(){
        return "spring组件中加载bean 123456678990";
    }
}
