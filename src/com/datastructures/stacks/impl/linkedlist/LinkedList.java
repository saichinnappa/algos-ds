package com.datastructures.stacks.impl.linkedlist;

public class LinkedList {
    Node head;

    void push(Node newNode) {
        Node currentNode = this.head;
        if (head == null) {
            this.head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    void pop() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("Stack is empty!");
        } else {
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("null\n");
    }
}
