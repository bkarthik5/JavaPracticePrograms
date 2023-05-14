package com.example.code;

public class SwapNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=30;
//        System.out.println("before swap");
//        System.out.println("Value of a:" +a);
//        System.out.println("Value of b :"+b);
//        System.out.println("After Swap");
//         int temp;
//         temp=a;
//         a=b;
//         b=temp;
//
//        System.out.println("Value of a:" +a);
//        System.out.println("Value of b :"+b);

        //Without temp

        System.out.println("before swap");
        System.out.println("Value of a:" +a);
        System.out.println("Value of b :"+b);
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("After Swap");
        System.out.println("Value of a:" +a);
        System.out.println("Value of b :"+b);
    }
}
