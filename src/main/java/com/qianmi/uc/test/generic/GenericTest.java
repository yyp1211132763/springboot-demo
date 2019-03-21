package com.qianmi.uc.test.generic;

/**
 * @author 叶延平[OF1643]
 * @create 2019-02-14 17:09
 **/
public class GenericTest<T> {

    public <T> void sayHi(T t){
        System.out.println("Hi "+t);
    }


    public static void main(String[] args) {
        String i="abc";
        new GenericTest<Integer>().<String>sayHi(i);

    }

}

