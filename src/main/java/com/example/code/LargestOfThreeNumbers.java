package com.example.code;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int x=800,y=500,z=800;
  /*      if(x>y && x>z){
            System.out.println("X is greatest number");
        }
        else if(y>z){
            System.out.println("y is greatest number");
        }
        else{
            System.out.println("z is the greatest numbers");
        }*/

        // 2nd method
        if(x>=y){
            if(x>=z){
                System.out.println("x is greatest");
            }
            else {
                System.out.println("z is greatest");
            }

        }
        else{
            if(y>=z){
                System.out.println("y is greatest");
            }
            else{
                System.out.println("z is greatest");
            }
        }
    }
}
