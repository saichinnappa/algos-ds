package practice.datastructures.graphs;

public class Queue {

    public int size;
    public int[] arrayQueue;
    public int front = 0, rear = -1;
    int currentSize = 0;

    public Queue(int size) {
        this.size = size;
        arrayQueue = new int[size];
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return currentSize == size;
    }

    public void enqueue(int element) {
        if (!isFull()) {
            arrayQueue[++rear] = element;
            currentSize++;
        } else {
            System.out.println("Queue is full!");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int i = 0;
            int dequeuedElement = arrayQueue[front];
            while (i != rear) {
                arrayQueue[i] = arrayQueue[i + 1];
                i++;
            }
            rear--;
            currentSize--;
            return dequeuedElement;
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = 0; i < currentSize; i++)
                System.out.print(arrayQueue[i] + " ");
        }
        System.out.println("");
    }
}
