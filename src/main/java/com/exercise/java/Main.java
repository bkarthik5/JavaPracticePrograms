package com.exercise.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            //3 System.out.println("Add number\n");
            System.out.println("Enter a button from 1 or 2 or 3");
            int button = sc.nextInt();
            //int b = sc.nextInt();
//            if(number%2==0){
//                System.out.println("Print Even");
//            }else {
//                System.out.println("Number is Odd");
//            }
//            if (button == 1) {
//                System.out.println("Hello");
//            } else if (button == 2) {
//                System.out.println("Namaste");
//            } else if (button == 3) {
//                System.out.println("Bonjour");
//            }
//            else {
//                System.out.println("invalid button");
//            }

            switch (button) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Namaste");
                    break;
                case 3:
                    System.out.println("Bonjour");
                    break;
                default :
                System.out.println("Invalid");
            }
        }
    }
}




