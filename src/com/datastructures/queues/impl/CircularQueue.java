package com.datastructures.queues.impl;

import java.util.Arrays;

public class CircularQueue {

    int[] queue;
    int front;
    int rear;
    int maxSize;
    int currentSize;

    CircularQueue(int size) {
        queue = new int[size];
        maxSize = size;
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return currentSize == maxSize;
    }

    boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    void enqueue(int value) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            queue[rear] = value;
            currentSize++;
            if (front == -1) {
                front = rear;
            }
        } else {
            System.out.println("Queue is full!");
        }
    }

    void dequeue() {
        if (!isEmpty()) {
            System.out.println("Dequeued Element: " + queue[front]);
            front = (front + 1) % maxSize;
            currentSize--;
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void print() {
        System.out.println(Arrays.toString(queue));
    }
}
