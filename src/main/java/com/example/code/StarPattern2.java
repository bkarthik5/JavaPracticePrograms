package com.example.code;

public class StarPattern2 {
    public static void main(String[] args) {

        //   *
        //  **
        // ***
        //****

        ////Pyramid pattern if we put space before *
        //    *
        //   * *
        //  * * *
        // * * * *
        for (int i=0;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
               // System.out.print(" *"); //Pyramid pattern if we put space before *
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
