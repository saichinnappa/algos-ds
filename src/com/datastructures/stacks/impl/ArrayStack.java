package com.datastructures.stacks.impl;

import java.util.Arrays;

class ArrayStack<Integer> {

    int[] stack;
    int top;
    int maxSize;
    int currentSize;

    ArrayStack(int size) {
        stack = new int[size];
        maxSize = size;
        top = -1;
    }

    boolean isFull() {
        return maxSize == currentSize;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int value) {
        if (!isFull()) {
            stack[++top] = value;
            currentSize++;
        } else {
            System.out.println("Stack is full");
        }
    }

    int pop() {
        if (!isEmpty()) {
            currentSize--;
            return stack[top--];
        } else {
            System.out.println("Stack is empty");
        }
        return -1;
    }

    void print() {
        System.out.println(Arrays.toString(stack));
    }

}
