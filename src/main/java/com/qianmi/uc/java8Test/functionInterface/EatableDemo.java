package com.qianmi.uc.java8Test.functionInterface;

/**
 * 函数式接口demo
 *
 * @author 叶延平[OF1643]
 * @create 2019-02-11 10:44
 **/
public class EatableDemo {
    public static void main(String[] args) {
        Eatable eatable=()-> System.out.println("chichichi");

        eatable.eat();



    }
}

