package com.example.code;

public class Exercise {
    public static void main(String[] args) {
//        int arr []={1,2,3,4,5,6,3};
//        for (int i=0;i< arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println("duplicate value is:" + arr[i]);
//                }
//            }
//        }
//       Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//       int num=sc.nextInt();
//       int fact=1;
//       for (int i=1;i<=num;i++){
//           fact=fact*i;
//       }
//        System.out.println("Factorial of " + num + " is " +fact);

        int arr[]={1,2,3,4,4,3,5};
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }

}}
