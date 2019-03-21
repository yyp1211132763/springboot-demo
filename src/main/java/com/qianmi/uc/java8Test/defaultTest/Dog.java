package com.qianmi.uc.java8Test.defaultTest;

/**
 * 11
 *
 * @author 叶延平[OF1643]
 * @create 2019-02-11 10:57
 **/
public class Dog implements Animal {
    public void voice(){
        System.out.println("wangwangwang");
    }



    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.voice();

    }
}




