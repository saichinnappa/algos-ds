package com.alogirthhms.sorting;

import java.util.Arrays;

class InsertionSort {

    public static void main(String[] args) {
        int[] unsortedArray = {50, 40, 30};
        insertionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    private static void insertionSort(int[] unsortedArray) {
        for (int i = 1; i < unsortedArray.length; i++) {
            int element = unsortedArray[i];
            int j = i - 1;
            while (j != -1 && element < unsortedArray[j]) {
                int temp = unsortedArray[j];
                unsortedArray[j] = unsortedArray[i];
                unsortedArray[i] = temp;
                i--;
                j--;
            }
        }
    }
}