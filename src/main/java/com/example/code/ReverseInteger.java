package com.example.code;

public class ReverseInteger {
    public static void main(String[] args) {
        long num = 744693;
        long rev = 0;

        while(num!=0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);

        //method 2

        long num1 = 437983;
        StringBuffer sb = new StringBuffer(String.valueOf(num1)).reverse();
        System.out.println(sb);
    }

}
