package com.alogirthhms.sorting;

import java.util.Arrays;

/**
 * INSERTION SORT:
 * Step1: First element will be used to compare with other elements.
 * Step2: Move forward from second element in the list and start comparing to immediate left part of the list.
 * Step3: Repeat step 2 until the element is placed in the right position.
 * <p>
 * Time Complexity: O(n^2) - in case of elements are in reverse order.
 * Space Complexity: O(1) - Since existing data structure is modified without creating new.
 */

public class InsertionSort {

    public static void main(String[] args) {
        int[] unsortedArray = {5, 4, 3, 2, 1};
        int[] sortedArray = sortArray(unsortedArray, unsortedArray.length);
        System.out.println(Arrays.toString(sortedArray));

    }

    private static int[] sortArray(int[] unsortedArray, int length) {
        for (int i = 1; i < unsortedArray.length; i++) {
            int elementToBeSorted = unsortedArray[i];
            int j = i - 1;
            while (j != -1 && elementToBeSorted < unsortedArray[j]) {
                int temp = unsortedArray[j];
                unsortedArray[j] = unsortedArray[i];
                unsortedArray[i] = temp;
                j--;
                i--;
            }
        }
        return unsortedArray;
    }
}
