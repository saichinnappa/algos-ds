package com.datastructures.linkedlists.doubly.impl;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        DLLNode dllNode1 = new DLLNode(1);
        DLLNode dllNode2 = new DLLNode(2);
        DLLNode dllNode3 = new DLLNode(3);
        doublyLinkedList.insert(dllNode1);
        doublyLinkedList.insert(dllNode2);
        doublyLinkedList.insert(dllNode3);
        doublyLinkedList.print();
//        doublyLinkedList.delete(dllNode1);
//        doublyLinkedList.print();
    }
}
