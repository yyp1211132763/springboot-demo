package com.qianmi.uc;

import lombok.extern.slf4j.Slf4j;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author
 * @create 2018-08-25 10:05 **/


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class AnnotationTest {

    //顺序是BeforeClass-->before-->test1-->after-->before-->test2-->after-->afterClass

    @BeforeClass
    public static void  beforeClass(){
        System.out.println("我beforeClass所有test方法执行前执行一次，而且必须是static");
    }

    @Before
    public  void  before(){
        System.out.println("我before每次test方法前都执行一次");
    }


    @Test
    public  void  test1(){
        System.out.println("test1执行");
    }


    @Test
    public  void  test2(){
        System.out.println("test2执行");
    }


    @After
    public  void  after(){
        System.out.println("我after每次test方法结束都执行一次");
    }


    @AfterClass
    public static void  afterClass(){
        System.out.println("我afterClass所有test方法执行结束后执行一次，我也必须是static");
    }

}
