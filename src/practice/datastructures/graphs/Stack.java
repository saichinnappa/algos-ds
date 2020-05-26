package practice.datastructures.graphs;

public class Stack {

    public int size;
    public int currentSize;
    public int[] stackArray;
    public int top;

    public Stack(int size) {
        this.size = size;
        this.stackArray = new int[size];
        this.currentSize = 0;
        this.top = -1;
    }

    public boolean isFull() {
        return currentSize == size;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void push(int element) {
        if (!isFull()) {
            currentSize++;
            stackArray[++top] = element;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            currentSize--;
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }
}
