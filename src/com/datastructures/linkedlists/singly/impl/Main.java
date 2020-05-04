package com.datastructures.linkedlists.singly.impl;

public class Main {

    public static void main(String[] args) {
        Node head = new Node(0);
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtHead(head);
        Node node1 = new Node(1);
        singlyLinkedList.insertAtEnd(node1);
        singlyLinkedList.print();
        Node node2 = new Node(2);
        singlyLinkedList.insertAtEnd(node2);
//        Node node3 = new Node(3);
//        singlyLinkedList.insertAtEnd(node3);
        singlyLinkedList.print();
//        singlyLinkedList.deleteHead();
//        singlyLinkedList.deleteHead();
//        singlyLinkedList.print();
//        Node node4 = new Node(4);
//        singlyLinkedList.insertAtEnd(node4);
//        Node node5 = new Node(5);
//        Node node6 = new Node(6);
//        singlyLinkedList.insertAtEnd(node5);
//        singlyLinkedList.insertAtEnd(node6);
//        singlyLinkedList.print();
//        singlyLinkedList.deleteTail();
//        singlyLinkedList.print();
//        singlyLinkedList.deleteSelected(node2);
//        singlyLinkedList.print();
//        singlyLinkedList.deleteSelected(node4);
//        singlyLinkedList.print();
        singlyLinkedList.reverse();
        singlyLinkedList.print();
    }
}
