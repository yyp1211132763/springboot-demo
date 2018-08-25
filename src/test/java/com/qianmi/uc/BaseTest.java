package com.qianmi.uc;

import com.qianmi.uc.config.TestProperties;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author
 * @create 2018-08-25 10:05
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class BaseTest {

    @Autowired
    private TestProperties testProperties;

    @Autowired
    public ApplicationContext context;

    @Autowired
    public Environment environment;


    @Test
    public  void  test1(){
        log.info("用户名是={}",testProperties.getUser());
        log.info("环境信息是",environment.getProperty("qianmi.dubbo.consumer.retries"));
    }




}
