package com.alogirthhms.sorting;

import java.util.Arrays;

class QuickSort {

    public static void main(String[] args) {
        int[] unsortedArray = {2, 1, 8, 4, 6, 7};
        quickSort(unsortedArray, 0, unsortedArray.length - 1);
        System.out.println(Arrays.toString(unsortedArray));
    }

    private static void quickSort(int[] unsortedArray, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(unsortedArray, start, end);
            quickSort(unsortedArray, 0, pivotIndex - 1);
            quickSort(unsortedArray, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] unsortedArray, int start, int end) {
        int pivot = unsortedArray[end];
        int pivotIndex = end;
        for (int i = start; i < end; i++) {
            if (pivot < unsortedArray[i]) {
                int temp = unsortedArray[i];
                unsortedArray[i] = pivot;
                unsortedArray[pivotIndex] = temp;
                pivotIndex = i;
            }
        }
        return pivotIndex;
    }
}