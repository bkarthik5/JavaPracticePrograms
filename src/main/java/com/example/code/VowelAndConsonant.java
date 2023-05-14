package com.example.code;

public class VowelAndConsonant {
    public static void main(String[] args) {
        //a ,e,i ,o ,u
        char ch='d';
        if(ch =='a'||ch =='e'||ch =='a'||ch =='i'||ch =='o'||ch =='u' ){
            System.out.println(ch + " is vowel");

        }
        else {
            System.out.println(ch + " is consonant");
        }
        System.out.println("======= Using switch");
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch +" is Vowel");
                break;
            default:
                System.out.println(ch+ " is Consonant");
        }
    }
}
