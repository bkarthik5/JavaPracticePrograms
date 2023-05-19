package com.exercise.java;

import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 15};
        int target = 9;
        twoSum(nums, target);
    }

    public static void twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
        map.put(nums[i],i);
        int second=target-nums[i];
        if(map.containsKey(second)){
            System.out.println(map.get(second)+","+i);
            return;
        }
        map.put(nums[i],i);
        }
        System.out.println("two nums doesn't add up");
    }
}

