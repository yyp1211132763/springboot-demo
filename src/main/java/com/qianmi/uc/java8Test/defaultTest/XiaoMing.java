package com.qianmi.uc.java8Test.defaultTest;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * @author 叶延平[OF1643]
 * @create 2019-02-11 11:10
 **/
public class XiaoMing implements Animal,Friend {
    @Override
    public void voice() {
        System.out.println("我要开始呼了");

    }

    @Override
    public void eat() {
        Friend.super.eat();
    }


    public static void main(String[] args) {
        XiaoMing x=new XiaoMing();
        x.eat();
        x.voice();
        Animal.sleep();

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });


        new Thread(()->{
            System.out.println("12");
        });
    }
}

