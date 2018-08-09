package com.vamshi.ds.utils;

public class SortUtils {


    public static void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }
}
