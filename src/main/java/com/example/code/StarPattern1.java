package com.example.code;

public class StarPattern1 {
    public static void main(String[] args) {

        //*
        //**
        //***
        //****
        //*****
//        for(int i=0;i<=4;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //*****
//        //****
//        //***
//        //**
//        //*
//        for(int i=0;i<=4;i++){
//            for(int j=4;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//
//        12345
//        1234
//        123
//        12
//        1
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
