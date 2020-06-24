package practice.datastructures;

import java.util.Arrays;

public class Stack {

    int[] stackArray;
    int currentSize;
    int maxSize;
    int top;

    Stack(int size) {
        stackArray = new int[size];
        maxSize = size;
    }

    boolean isEmpty() {
        return currentSize == 0;
    }

    boolean isFull() {
        return currentSize == maxSize;
    }

    void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[top++] = element;
        currentSize++;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        currentSize--;
        return stackArray[--top];
    }

}

class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(25);
        System.out.println(stack.pop());
        stack.push(30);
        stack.push(40);
        stack.push(45);
        stack.push(50);
        System.out.println(stack.pop());
        stack.push(50);
        System.out.println(Arrays.toString(stack.stackArray));
    }
}

//class TwoStacks<V> {
//    V[] twoArrayStack;
//    int s1Pos;
//    int s2Pos;
//    int maxSize;
//    int currSize;
//
//    TwoStacks(int size) {
//        twoArrayStack = (V[]) new Object[size];
//        this.maxSize = size;
//        this.s1Pos = -1;
//        this.s2Pos = -1;
//    }
//
//    boolean isEmpty() {
//        return currSize == 0;
//    }
//
//    boolean isFull() {
//        return maxSize == currSize;
//    }
//
//    void push1(V element) {
//        if (isFull()) {
//            System.out.println("Stack is full");
//            return;
//        }
//        if (s2Pos > -1) {
//            for (int i = currSize + 1; i > s2Pos; i--) {
//                twoArrayStack[i] = twoArrayStack[i - 1];
//            }
//            twoArrayStack[s2Pos] = element;
//
//        } else {
//            twoArrayStack[++s1Pos] = element;
//        }
//        currSize++;
//    }
//
//    V pop1() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty");
//            return null;
//        }
//        V top = twoArrayStack[s1Pos];
//        if (s1Pos > 0) {
//            for (int i = s1Pos; i > s2Pos - 1; i++) {
//                twoArrayStack[i] = twoArrayStack[i + 1];
//            }
//        }
//        s1Pos--;
//        currSize--;
//        return top;
//    }
//
//    void push2(V element) {
//        if (isFull())
//            System.out.println("Stack is full");
//        if (s2Pos == -1)
//            twoArrayStack[++s2Pos] = element;
//        else {
//            for (int i = currSize + 1; i > s2Pos; i--) {
//                twoArrayStack[i] = twoArrayStack[i - 1];
//            }
//            twoArrayStack[s2Pos] = element;
//        }
//        s2Pos++;
//        currSize++;
//    }
//
//    V pop() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty");
//            return null;
//        }
//        V top = twoArrayStack[s2Pos];
//    }s2Pos
//}
