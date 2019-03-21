package com.qianmi.uc.core;

/**
 * @author 叶延平[OF1643]
 * @create 2019-02-22 9:39
 **/
public class TestPerson {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(1);
        addage(p);
        System.out.println(p.getAge());
        System.out.println(p.getUrl());
    }

    private static void addage(Person p) {
        p.setAge(2);
        p.setUrl("123");
    }
}

