package com.example.code;

public class ExponentPowerConcept {
    public static void main(String[] args) {
        int base=8;
        int exponent=3;
        int result=1;
        while(exponent!=0){
            result=result*base;
            --exponent;
        }
        System.out.println(result);
    }
}
