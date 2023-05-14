package com.example.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapTest1 {
    public static void main(String[] args) {
        // String arr[] = {"Amazon", "A", "Amazon", "abc", "Dell", "Apple"};
        int arr[] = {1, 2, 3, 4, 1};
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        //for(String e:arr){
//        for (String e : arr) {
//            Integer count = map.get(e); //null initially
//            if (count == null) {
//                map.put(e, 1);
//                //System.out.println(map);
//            } else {
//                map.put(e, ++count); //++count pre incrementing
//            }
//            //print all duplicates
//
//
//            }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer e : arr) {
            Integer count = map.get(e);
            if (count == null) {
                map.put(e, 1);
            } else {
                map.put(e, ++count);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("duplicate value is : " +entry.getKey());
            }
        }
    }
}





