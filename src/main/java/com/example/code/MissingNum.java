package com.example.code;

public class MissingNum {
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
      //  System.out.println(sum);
        int sum1=0;
        for (int j=1;j<=7;j++){
            sum1=sum1+j;
        }
       // System.out.println(sum1);
        System.out.println("missing number is :"+(sum1-sum));
    }
}
