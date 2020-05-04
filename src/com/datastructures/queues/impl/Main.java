package com.datastructures.queues.impl;

public class Main {

    public static void main(String[] args) {

        //Regular Queue
        ArrayQueue arrayQueue = new ArrayQueue(3);
        System.out.println("Creating queue with size 3.");
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(6);
        arrayQueue.print();
        System.out.println("pushing 8..");
        arrayQueue.enqueue(8);
        System.out.println("pushing 10..");
        arrayQueue.enqueue(10);
        System.out.println("pop..");
        arrayQueue.dequeue();
        arrayQueue.print();
        System.out.println("pushing 8...");
        arrayQueue.enqueue(8);
        arrayQueue.print();
        System.out.println("pushing 10...");
        arrayQueue.enqueue(10);
        System.out.println("pop..");
        arrayQueue.dequeue();
        arrayQueue.print();
        System.out.println("pop..");
        arrayQueue.dequeue();
        arrayQueue.print();
        System.out.println("pushing 11...");
        arrayQueue.enqueue(11);
        System.out.println("pushing 12...");
        arrayQueue.enqueue(12);
        arrayQueue.print();

//        Circular Queue
//        CircularQueue circularQueue = new CircularQueue(5);
//        circularQueue.enqueue(1);
//        circularQueue.enqueue(2);
//        circularQueue.enqueue(3);
//        circularQueue.enqueue(4);
//        circularQueue.enqueue(5);
//        circularQueue.dequeue();
//        circularQueue.dequeue();
//        circularQueue.enqueue(12);
//        circularQueue.enqueue(14);
//        circularQueue.print();
    }
}
