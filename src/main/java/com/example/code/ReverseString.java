package com.example.code;

public class ReverseString {
    public static void main(String[] args) {
        String str = "this is reversing";
        int len = str.length();
        //System.out.println(len);
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        System.out.println("Using string buffer");
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
