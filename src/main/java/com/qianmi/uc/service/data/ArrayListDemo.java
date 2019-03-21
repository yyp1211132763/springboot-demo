package com.qianmi.uc.service.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 叶延平[OF1643]
 * @create 2018-11-09 17:51
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        //由于没有规定数组长度。所以list需要多次扩容并且移动数据
        long startTime = System.currentTimeMillis();
        List list =new ArrayList<>();
        for(int i=0;i<9999999;i++){
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);


        long startTime1 = System.currentTimeMillis();
        List list1 =new ArrayList<>(88888);
        for(int i=0;i<9999999;i++){
            list1.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        long totalTime1 = endTime1 - startTime1;
        System.out.println(totalTime1);
    }
}

