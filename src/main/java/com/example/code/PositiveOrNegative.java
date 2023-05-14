package com.example.code;

public class PositiveOrNegative {
    public static void main(String[] args) {
        double number = 12.9;
        if(number < 0.0){
            System.out.println(number+" is negative number");

        }
        else if(number>0.0){
            System.out.println(number +" is positive number");
        }
        else{
            System.out.println(number + " is zero");
        }
    }
}
