package com.datastructures.linkedlists.singly.impl;

class SinglyLinkedList {

    Node head;

    SinglyLinkedList(Node head) {
        this.head = head;
    }

    void insert(Node newNode) {
        Node currentNode = head;
        if (head == null)
            head = newNode;
        else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    void insertAfter(Node previousNode, Node newNode) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == previousNode.data) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                break;
            } else {
                currentNode = currentNode.next;
            }
        }
    }

    void delete(Node delNode) {
        Node prevNode = head;
        Node nextNode = head.next;
        if (head.data == delNode.data) {
            head = nextNode;
        } else {
            while (nextNode != null) {
                if (nextNode.data == delNode.data) {
                    prevNode.next = delNode.next;
                    break;
                } else {
                    prevNode = nextNode;
                    nextNode = nextNode.next;
                }
            }
        }
    }

    boolean search(Node searchNode) {
        Node currentNode = head;
        if (head.data == searchNode.data)
            return true;
        else {
            while (currentNode != null) {
                if (currentNode.data == searchNode.data) {
                    return true;
                }
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    int length() {
        Node currentNode = head;
        if (head == null)
            return -1;
        int count = 0;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    void reverse() {
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next; // 1
            System.out.println(next.data);
            current.next = previous; //null
            System.out.println(current.next);
            previous = current; // 0
            System.out.println(previous.data);
            current = next; // 1
            System.out.println(current.data);
        }
        //Linking Head Node with the new First Element
        print();

    }

    void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}
