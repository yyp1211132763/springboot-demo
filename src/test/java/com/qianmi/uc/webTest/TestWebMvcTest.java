package com.qianmi.uc.webTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * 测试@WebMvcTest
 * @author
 * @create 2018-08-25 10:05
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest
@Slf4j
public class TestWebMvcTest {


    @Autowired
    public MockMvc mockMvc;



    @Test public void test() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/hello")).andExpect(
                MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("user home")
        );

    }


}
