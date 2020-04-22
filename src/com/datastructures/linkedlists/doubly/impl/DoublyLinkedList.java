package com.datastructures.linkedlists.doubly.impl;

public class DoublyLinkedList {

    DLLNode head;

    void insert(DLLNode newNode) {
        System.out.println(newNode.next);
        DLLNode currentNode = head;
        if (head == null) {
            newNode.prev = null;
            this.head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                currentNode.next = newNode;
                newNode.prev = currentNode;
            }
        }
    }

    void delete(DLLNode delNode) {
        DLLNode currentNode = this.head;
        if (this.head != null && this.head.data == delNode.data) {
            this.head = this.head.next;
            this.head.prev = null;
        }
    }

    void print() {
        DLLNode currentNode = head;
        DLLNode lastNode = null;
        System.out.print("\nForward:\n");
        System.out.print("null->");
        while (currentNode != null) {
            if (currentNode.next == null)
                lastNode = currentNode;
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;

        }
        System.out.println(currentNode);
        System.out.print("Reverse:\n");
        System.out.print("null->");
        while (lastNode != null) {
            System.out.print(lastNode.data + "->");
            lastNode = lastNode.prev;
        }
        System.out.print(lastNode);
    }

}
