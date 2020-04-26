package com.datastructures.stacks.impl.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(2);
        linkedList.push(node1);
        linkedList.push(node2);
        linkedList.push(node3);
        linkedList.push(node4);
        linkedList.push(node5);
        linkedList.push(node6);
        linkedList.print();
        linkedList.pop();
        linkedList.pop();
        linkedList.print();
        linkedList.push(node7);
        linkedList.print();
    }
}
