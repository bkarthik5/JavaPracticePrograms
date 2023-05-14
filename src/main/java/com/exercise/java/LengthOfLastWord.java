package com.exercise.java;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s="This is karthik";
        lengthOfLastWord(s);
    }
    public static void lengthOfLastWord(String s) {
            String arr[]=s.split(" ");

            int val=0;
            for (int i=0;i<arr.length;i++){
                val=arr[i].length();
            }
        System.out.println("Length of last word \n" +s+ " is " +val);
    }
}

