package com.example.code;

public class LargestAndSmallestInArray {
    public static void main(String[] args) {
        int numbers[]={-22,10,33,-22,54,67};
        int largest =numbers[0];
        int smallest=numbers[0];
        for(int i=1;i<numbers.length;i++){
           // System.out.println(numbers[i]);
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            else if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
