package com.alogirthhms.sorting;

import java.util.Arrays;

class SelectionSort {

    public static void main(String[] args) {
        int[] unsortedArray = {5, 4, 3, 2, 1};
        selectionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    private static void selectionSort(int[] unsortedArray) {

        int minElement = Integer.MAX_VALUE;
        for (int j = 0; j < unsortedArray.length; j++) {
            int minIndex = -1;
            minElement = unsortedArray[j];
            for (int i = j; i < unsortedArray.length; i++) {
                if (unsortedArray[i] < minElement) {
                    minElement = unsortedArray[i];
                    minIndex = i;
                }
            }
            if (minIndex != -1) {
                int swap = unsortedArray[j];
                unsortedArray[j] = minElement;
                unsortedArray[minIndex] = swap;
            }
        }
        System.out.println(minElement);
    }

}