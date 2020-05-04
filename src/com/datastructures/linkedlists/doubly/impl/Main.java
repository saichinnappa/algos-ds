package com.datastructures.linkedlists.doubly.impl;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        DLLNode dllNode1 = new DLLNode(1);
        DLLNode dllNode2 = new DLLNode(2);
        DLLNode dllNode3 = new DLLNode(3);
        doublyLinkedList.insertAtEnd(dllNode1);
        doublyLinkedList.insertAtEnd(dllNode2);
        doublyLinkedList.insertAtEnd(dllNode3);
        System.out.println("Insert at end");
        doublyLinkedList.print();
        System.out.println("Insert at head");
        DLLNode dllNode0 = new DLLNode(0);
        doublyLinkedList.insertArHead(dllNode0);
        doublyLinkedList.print();
        doublyLinkedList.findPrevAndNextNodes(dllNode2);
        doublyLinkedList.deleteAtLocation(dllNode0);
        doublyLinkedList.print();
        doublyLinkedList.printReverse();

    }
}
