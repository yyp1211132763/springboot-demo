package com.qianmi.uc.java8Test.defaultTest;

public interface Animal {
    //接口中可以有非抽象方法了
    default void eat(){
        System.out.println("吃东西");
    }
    void voice();

    static void sleep(){
        System.out.println("睡了");
    }
}
