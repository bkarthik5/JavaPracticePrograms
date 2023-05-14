package com.example.code;

import java.util.stream.IntStream;


public class PrintOneToHundredWithoutLoops {
    public static void main(String[] args) {
       //printWithout loops
        //1 method recursive
        //2 java streams
        //printNumber(1);
        IntStream.range(1,101).forEach(e->System.out.println(e));  //Java Streams

        }

    public static void printNumber(int num) {
        if (num<=100){
            System.out.println(num);
            num++;
            printNumber(num);
        }
    }


    }

