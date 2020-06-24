package practice.datastructures;

import java.util.Arrays;

public class Queue {

    int[] queueArray;
    int front = 0;
    int rear = -1;
    int maxSize;
    int currentSize;

    Queue(int size) {
        queueArray = new int[size];
        maxSize = size;
    }

    boolean isEmpty() {
        return currentSize == 0;
    }

    boolean isFull() {
        return currentSize == maxSize;
    }

    void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queueArray[++rear] = val;
        currentSize++;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int firstElement = queueArray[front];
        for (int i = 0; i < currentSize - 1; i++) {
            queueArray[i] = queueArray[i + 1];
        }
        queueArray[--currentSize] = 0;
        rear--;
        return firstElement;
    }
}

class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(25);
        System.out.println(queue.dequeue());
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(45);
        queue.enqueue(50);
        System.out.println(queue.dequeue());
        queue.enqueue(50);
        System.out.println(Arrays.toString(queue.queueArray));
    }

}