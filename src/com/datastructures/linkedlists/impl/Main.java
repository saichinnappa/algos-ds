package com.datastructures.linkedlists.impl;

public class Main {

    public static void main(String[] args) {
        Node head = new Node(0);
        SinglyLinkedList linkedList = new SinglyLinkedList(head);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        linkedList.insert(node1);
        linkedList.insert(node2);
        linkedList.print(linkedList);
        linkedList.delete(node2);
        linkedList.print(linkedList);
        linkedList.delete(node1);
        linkedList.print(linkedList);
        linkedList.delete(head);
        linkedList.print(linkedList);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        linkedList.insert(node4);
        linkedList.insert(node5);
        linkedList.print(linkedList);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        linkedList.insertAfter(node4, node6);
        linkedList.insertAfter(node6, node7);
        linkedList.print(linkedList);
    }
}
