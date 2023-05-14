package com.example.code;

public class LeapYear {
    public static void main(String[] args) {
        // divisible by 4 for all century years ending with 00
        //century is a leap year only when its divisible by 400
        int year=2000;
        boolean leap=false;
        if(year%4==0){
            if(year % 100 ==0){
                if(year % 400 ==0){
                    leap=true;
                }
                else{
                    leap=false;
                }
            }
            else{
                leap=true;
            }
        }
        else{
            leap=false;
        }
        if(leap){
            System.out.println(year + " is leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
