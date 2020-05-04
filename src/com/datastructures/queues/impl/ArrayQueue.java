package com.datastructures.queues.impl;

public class ArrayQueue {
    int[] queue;
    int front;
    int rear;
    int maxSize;
    int currentSize;

    public ArrayQueue(int size) {
        queue = new int[size];
        this.maxSize = size;
        front = 0;
        rear = 0;
        currentSize = 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public boolean isEmpty() {
        return front == 0 && rear == 0;
    }

    public void enqueue(int val) {
        if (!isFull()) {
            queue[rear++] = val;
            currentSize++;
        } else {
            System.out.println("Queue is full!");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            currentSize--;
            rear--;
            int dequeuedElement = queue[0];
            for (int i = 0; i < currentSize; i++) {
                queue[i] = queue[i + 1];
            }
            return dequeuedElement;
        } else {
            System.out.println("Queue is empty!");
        }
        return -1;
    }

    void print() {
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.print("\n");
    }
}