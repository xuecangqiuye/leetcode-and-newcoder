package com.wsb.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FastSort {
    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};
        int R = 0;
        int L = arr.length - 1;
        quickSort(arr, R, L);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        int newLow = low;
        int newHigh=high;
        if (low < high) {

            int stdValuew = arr[low];

            while (low < high) {
                while (low < high && stdValuew <= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && stdValuew >= arr[low]) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = stdValuew;
            System.out.println(Arrays.toString(arr));

            quickSort(arr,newLow, low - 1);
            quickSort(arr, low + 1, newHigh);
        }
    }


}
