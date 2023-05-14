package com.example.code;

import java.util.Scanner;

public class palindromeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int org = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);
        if (org == rev) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

//public class palindromeN {
//    public boolean isPalindrome(int x) {
//        int rev =0;
//        int org =x;
//        while (x>0){
//            rev=rev*10+x%10;
//            x=x/10;
//        }
//        System.out.println(rev);
//        if(org==rev){
//            System.out.println("Given number is palindrome");
//            return true;
//        }
//        else{
//            System.out.println("Given number is not a palindrome");
//            return false;
//        }
//
//    }

    




