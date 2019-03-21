package com.qianmi.uc.java8Test.defaultTest;


public interface Friend {
    default void eat(){
        System.out.println("吃饱了");
    }
}
