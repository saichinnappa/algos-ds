package com.datastructures.stacks.impl;

class ArrayStack<Integer> {

    private int maxSize;
    private int top;
    private int[] array;

    //initialize
    ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        array = new int[this.maxSize];
        top = -1;
    }

    //isEmpty
    boolean isEmpty(){
        return top == -1;
    }

    //isFull
    boolean isFull(){
        return top == maxSize-1;
    }

    //push
    void push(int value){
        if(!isFull())
            array[++top] = value;
        else
            System.out.println("STACK IS FULL: cannot push: "+ value);
    }

    //pop
    int pop(){
        if(!isEmpty())
            return array[top--];
        else{
            System.out.println("STACK IS EMPTY!");
            return top;
        }
    }
}
