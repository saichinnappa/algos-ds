package com.alogirthhms.sorting;

import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = {5, 4, 3, 2, 1};
        bubbleSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    private static void bubbleSort(int[] unsortedArray) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                int temp = unsortedArray[i];
                if (unsortedArray[i + 1] < unsortedArray[i]) {
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}