package com.datastructures.linkedlists.singly.impl;

class SinglyLinkedList {
    Node head;

    void insertAtHead(Node newNode) {
        if (this.head != null) {
            newNode.next = this.head;
        }
        this.head = newNode;
    }

    void insertAtEnd(Node newNode) {
        Node currentNode = head;
        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    void deleteHead() {
        if (head == null) {
            System.out.println("SLL is empty, nothing to delete.");
        } else {
            head = head.next;
        }
    }

    void deleteTail() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("SLL is empty, nothing to delete.");
        } else {
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    void deleteSelected(Node delNode) {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("SLL is empty, nothing to delete.");
        } else if (currentNode.data == delNode.data) {
            deleteHead();
        } else {
            Node previousNode = currentNode;
            while (currentNode != null) {
                if (currentNode.data == delNode.data) {
                    previousNode.next = currentNode.next;
                }
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    }

    void reverse() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("SLL is empty, nothing to reverse.");
        } else {
            Node previousNode = null;
            Node nexNode = null;
            while (currentNode != null) {
                nexNode = currentNode.next;
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode = nexNode;
            }
            this.head = previousNode;
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