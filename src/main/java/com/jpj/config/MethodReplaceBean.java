package com.jpj.config;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: jingpj
 * @Date：creste in 2019/1/30
 */
@Component
public class MethodReplaceBean implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {

        return "我是替换的方法";
    }
}
