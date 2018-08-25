package com.qianmi.uc.webTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author
 * @create 2018-08-25 10:05
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class TestRestTemplateFunc {

    @Autowired
    private TestRestTemplate testRestTemplate;


    @Test
    public void test1() {
        String context = testRestTemplate.getForObject("/hello", String.class);
        System.out.println(context);
    }


}
