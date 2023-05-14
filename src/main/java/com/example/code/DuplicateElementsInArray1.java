package com.example.code;

public class DuplicateElementsInArray1 {

    public static void main(String[] args) {
        //String arr[]={"Amazon","Apple","Amazon","Big","Small","Small"};
        int arr[]={1,2,3,4,3,4};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
          // if(arr[i].equals(arr[j])){ (for string)
                if(arr[i]==(arr[j])){ //Integers
               System.out.println(arr[i]);
           }
        }
    }
}
}
