package com.example.code;

public class Sample {

    public static void main(String[] args) {
        String str="This is Java";
        int len = str.length();
        String rev="";
        for (int i=len-1;i>=0;i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}


