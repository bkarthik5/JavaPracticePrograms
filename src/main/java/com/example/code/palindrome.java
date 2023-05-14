package com.example.code;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int actual = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        System.out.println(rev);
        if (actual == rev) {
            System.out.println("Palindrome");

        } else
            System.out.println("not a palindrome");
    }
}





