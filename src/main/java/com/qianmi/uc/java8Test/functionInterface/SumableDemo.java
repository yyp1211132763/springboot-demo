package com.qianmi.uc.java8Test.functionInterface;

/**
 * 函数式接口demo
 *
 * @author 叶延平[OF1643]
 * @create 2019-02-11 10:44
 **/
public class SumableDemo {
    public static void main(String[] args) {
       Sumble sumble=(a,b)-> {
           System.out.println("w  ya");
            return a + b;
       };


       int sum=sumble.add(3,4);

        System.out.println(sum);

    }
}

