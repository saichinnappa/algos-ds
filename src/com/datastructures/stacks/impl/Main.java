package com.datastructures.stacks.impl;

public class Main {

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack(5);
        stack.push(50);
        stack.push(30);
        stack.push(40);
        stack.push(20);
        stack.push(10);
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(60);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
