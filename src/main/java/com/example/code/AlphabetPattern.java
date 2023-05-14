package com.example.code;

public class AlphabetPattern {
    public static void main(String[] args) {

        //* Printing Alphabet Pattern
        //A
        //A B
        //A B C
        //A B C D
        //A B C D E
        //A B C D E F

        //a
        //a b
        //a b c
        //a b c d
        //a b c d e
        //a b c d e f
        //int alpha=65;// capital A
        int alpha=97;//small a
        for (int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.println();
        }
    }
}
