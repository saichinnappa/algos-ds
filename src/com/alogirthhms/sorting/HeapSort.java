package com.alogirthhms.sorting;

import java.util.Arrays;

class HeapSort {

    public static void main(String[] args) {
        int[] unsortedArray = {5, 8, 3, 6, 4, 1};
        int length = unsortedArray.length;
        buildHeap(unsortedArray, length);
//        deleteRoot(unsortedArray, length);
        int[] newArray = insertNode(unsortedArray, 9);
        System.out.println(Arrays.toString(newArray));
    }

    private static void buildHeap(int[] unsortedArray, int length) {

        int lastParentNode = length / 2 - 1;
        for (int i = lastParentNode; i >= 0; i--) {
            maxHeapify(unsortedArray, i, length);
        }
        System.out.println(Arrays.toString(unsortedArray));
    }

    private static void maxHeapify(int[] unsortedArray, int lastParentNode, int length) {
        int parentNodeIdx = lastParentNode;
        int leftNodeIdx = (lastParentNode * 2) + 1;
        int rightNodeIdx = (lastParentNode * 2) + 2;
        if (leftNodeIdx < length && unsortedArray[leftNodeIdx] > unsortedArray[parentNodeIdx]) {
            parentNodeIdx = leftNodeIdx;
        }
        if (rightNodeIdx < length && unsortedArray[rightNodeIdx] > unsortedArray[parentNodeIdx]) {
            parentNodeIdx = rightNodeIdx;
        }

        if (parentNodeIdx != lastParentNode) {
            int temp = unsortedArray[lastParentNode];
            unsortedArray[lastParentNode] = unsortedArray[parentNodeIdx];
            unsortedArray[parentNodeIdx] = temp;
            maxHeapify(unsortedArray, parentNodeIdx, length);
        }
    }

    private static void minHeapify(int[] unsortedArray, int lastParentNode, int length) {
        int parentNodeIdx = lastParentNode;
        int leftNodeIdx = (lastParentNode * 2) + 1;
        int rightNodeIdx = (lastParentNode * 2) + 2;
        if (leftNodeIdx < length && unsortedArray[leftNodeIdx] < unsortedArray[parentNodeIdx]) {
            parentNodeIdx = leftNodeIdx;
        }
        if (rightNodeIdx < length && unsortedArray[rightNodeIdx] < unsortedArray[parentNodeIdx]) {
            parentNodeIdx = rightNodeIdx;
        }
        if (parentNodeIdx != lastParentNode) {
            int temp = unsortedArray[lastParentNode];
            unsortedArray[lastParentNode] = unsortedArray[parentNodeIdx];
            unsortedArray[parentNodeIdx] = temp;
            minHeapify(unsortedArray, parentNodeIdx, length);
        }
    }

    private static void deleteRoot(int[] sortedArray, int length) {
        int firstElement = sortedArray[0];
        sortedArray[0] = sortedArray[length - 1];
        sortedArray[length - 1] = firstElement;
        length--;
        maxHeapify(sortedArray, 0, length);
        if (length > 1) {
            deleteRoot(sortedArray, length);
        }
    }

    static int[] insertNode(int[] array, int value) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = value;
        int parentNodeIdx = (newArray.length / 2) - 1;
        for (int i = parentNodeIdx; i >= 0; i--) {
            maxHeapify(newArray, i, newArray.length);
        }
        return newArray;
    }
}