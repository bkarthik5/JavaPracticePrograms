package com.example.code;

import java.util.Arrays;

public class AllNegativeNumbersOneSide {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        Arrays.sort(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
}
