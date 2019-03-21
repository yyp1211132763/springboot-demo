package com.qianmi.uc.java8Test.lambda;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author 叶延平[OF1643]
 * @create 2019-02-12 10:11
 **/
public class LambadTest {
    public static void main(String[] args) {
        Random random=new Random();
        random.ints().limit(10).forEach(
                System.out::print
        );
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        strings.stream().filter(s->StringUtils.isNotEmpty(s)).forEach((s)->{
            System.out.println(s);
        });

        strings=strings.stream().map(i->i+"sss").collect(Collectors.toList());
        strings.stream().forEach((s)->
            System.out.println(s)
        );

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers=numbers.stream().map(i->i+1).distinct().sorted().collect(Collectors.toList());
        numbers.stream().forEach((s)->{
            System.out.println(s);
        });


    }
}

