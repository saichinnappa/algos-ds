package com.datastructures.queues.impl;

class ArrayQueue {
    int[] queue;
    int front;
    int rear;
    int maxSize;
    int currentSize;

    ArrayQueue(int size) {
        queue = new int[size];
        this.maxSize = size;
        front = 0;
        rear = 0;
        currentSize = 0;
    }

    boolean isFull() {
        return currentSize == maxSize;
    }

    boolean isEmpty() {
        return front == 0 && rear == 0;
    }

    void enqueue(int val) {
        if (!isFull()) {
            queue[rear++] = val;
            currentSize++;
        } else {
            System.out.println("Queue is full!");
        }
    }

    void dequeue() {
        if (!isEmpty()) {
            currentSize--;
            rear--;
            for (int i = 0; i < currentSize; i++) {
                queue[i] = queue[i + 1];
            }
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void print() {
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.print("\n");
    }
}