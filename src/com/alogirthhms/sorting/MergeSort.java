package com.alogirthhms.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] unsortedArray = {4, 3, 5, 1};
        mergeSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static void mergeSort(int[] unsortedArray) {
        int length = unsortedArray.length;
        int mid = length / 2;
        //base condition to come out of recursion i.e when the arrays are broken down to individual elements
        if (length == 1)
            return;
        int[] leftArray = new int[mid]; //Create left array
        int[] rightArray = new int[length - mid]; // create right array
        for (int i = 0; i < leftArray.length; i++) { //populate with left side of unsorted array
            leftArray[i] = unsortedArray[i];
        }
        for (int j = 0; j < rightArray.length; j++) { //populate with right side of the unsorted array
            rightArray[j] = unsortedArray[mid + j];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(unsortedArray, leftArray, rightArray);
    }

    private static void merge(int[] unsortedArray, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) { //keep iterating until one of the condition fails and populate into unsorted array
            if (leftArray[i] <= rightArray[j]) {
                unsortedArray[k] = leftArray[i];
                i++;
            } else {
                unsortedArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftArray.length) { //this loop meant to add any left over elements in left side of the array to unsorted array
            unsortedArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArray.length) { //this loop meant to add any left over elements in right side of the array to unsorted array
            unsortedArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
