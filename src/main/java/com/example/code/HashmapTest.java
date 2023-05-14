package com.example.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapTest {
    public static void main(String[] args) {
       // int arr[]={1,2,3,4,3};
//        for (int val:arr){
//            System.out.print(val+ " ");
//        }
//        System.out.println();

        HashMap<Integer,String> map=new HashMap<Integer,String>();
         map.put(1,"Ant");
        map.put(2,"Boy");
        map.put(3,"Can");
        map.put(4,"Toy");
        for(Map.Entry<Integer,String> e:map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            System.out.println(key+ " " + map.get(key));
        }
            System.out.println("=======");
        map.remove(2);
            System.out.println(map);

        }
    }
}
