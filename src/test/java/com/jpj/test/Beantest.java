package com.jpj.test;

import com.jpj.BaseTest;
import com.jpj.beans.AbstractTestBean;
import com.jpj.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @Author: jingpj
 * @Date：creste in 2019/1/30
 */
@Slf4j
public class Beantest extends BaseTest{
    @Resource
    private TestService testService;

    @Resource
    private AbstractTestBean testBean;

    @Test
    public void replaceBean(){
        String res = testService.testMethod();
        log.info(res);
    }

    @Test
    public void lookupBean(){
        String res = testBean.resString();
        log.info(res);
    }
}
