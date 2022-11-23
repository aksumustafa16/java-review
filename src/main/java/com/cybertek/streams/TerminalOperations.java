package com.cybertek.streams;

import java.util.Arrays;

public class TerminalOperations {
    public static void main(String[] args) {
        System.out.println("*********COUNT***************");
        long count = Arrays.asList(1,2,3,4,6,5,7,8,9).stream().count();
        System.out.println("count = " + count);

        long count2 = Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cheery","Mango").stream().
                filter(str -> str.equals("Apple")).count();
        System.out.println("count2 = " + count2);
    }
}
