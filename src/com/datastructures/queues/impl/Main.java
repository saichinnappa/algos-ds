package com.datastructures.queues.impl;

public class Main {

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(8);
        arrayQueue.enqueue(10);
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.enqueue(12);
        arrayQueue.enqueue(14);
        arrayQueue.print();
    }
}
