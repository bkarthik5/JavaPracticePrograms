package com.example.code;

public class FactorialNumber {
    public static void main(String[] args) {
        //Factorial of 5 (5!) =5*4*3*2*1
        int num= 5;
        System.out.println(fact3(num));
    }

    public static void getFact(int num) {
        int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of " + num + " is :" + fact);
    }

    public static void getFact1(int num) {
        int fact=1;
        int j=1;
        while (j<=num){
            fact=fact*j;
            j++;
        }
        System.out.println("Factorial of " + num + " is :" + fact);
    }
    //recursive function : function calling itself
    public static int fact3(int num) {
        if (num==0)
            return 1;
        else
            return(num * fact3(num-1)) ;
    }


}
