package com.example.code;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        String arr[] = {"Amazon", "A", "Amazon", "abc", "Dell", "Apple"};
        //1 Bruteforce
        //2 Hash set
        //3 HashMap<K,V)
        //4 Streams

//        System.out.println("**************bruteforce method");//time complexity On^2
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i].equals(arr[j])) {
//                    System.out.println(arr[i]);
//                }
//            }
//        }
//        System.out.println("2nd method **************HashSet ");
//        Set<String> data = new HashSet<String>();
//        for (String e : arr) {
//            if (data.add(e) == false) {
//                System.out.println(e);
//            }
//        }
        //String arr[] = {"Amazon", "A", "Amazon", "abc", "Dell", "Apple"};
        System.out.println("3rd method **************HashMap ");
        Map<String,Integer>map=new HashMap<String,Integer>();
        for(String e:arr) {
            Integer count = map.get(e);
            if (count == null) {
                map.put(e, 1);
            } else {
                map.put(e, ++count);
            }
        }
        //print all duplicate elements:
        Set<Map.Entry<String,Integer>>entrySet=map.entrySet();
        for (Map.Entry<String ,Integer>entry:entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }

        System.out.println("4th method **************Java Streams ");
// String arr[] = {"Amazon", "A", "Amazon", "abc", "Dell", "Apple"};
        Set<String>dataSet=new HashSet<String>();
      Set<String >dupSet=  Arrays.asList(arr)
                                         .stream()
                                                .filter(e->!dataSet.add(e)).collect(Collectors.toSet());
        System.out.println(dupSet);

    }
}
