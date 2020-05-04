package com.datastructures.linkedlists.doubly.impl;

class DoublyLinkedList {

    DLLNode head;

    void insertAtEnd(DLLNode newNode) {
        DLLNode currentNode = head;
        if (head == null) {
            this.head = newNode;
        } else {
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = newNode;
            newNode.prevNode = currentNode;
        }
    }

    void insertArHead(DLLNode newNode) {
        if (head != null) {
            newNode.nextNode = this.head;
        }
        this.head = newNode;
    }

    void findPrevAndNextNodes(DLLNode dllNode) {
        DLLNode currentNode = head;
        DLLNode prevNode = null;
        DLLNode nextNode = null;
        if (head == null) {
            System.out.println("DLL is empty.");
        } else {
            while (currentNode != null) {
                if (currentNode.data == dllNode.data) {
                    prevNode = currentNode.prevNode;
                    nextNode = currentNode.nextNode;
                }
                currentNode = currentNode.nextNode;
            }
        }
        System.out.println("Previous: " + prevNode.data + " | Next: " + nextNode.data);
    }

    void deleteAtLocation(DLLNode dllNode) {
        DLLNode currentNode = head;
        if (head == null) {
            System.out.println("DLL is empty.");
        } else {
            DLLNode nextNode = null;
            DLLNode prevNode = null;
            while (currentNode != null) {
                if (currentNode.data == dllNode.data) {
                    prevNode = currentNode.prevNode;
                    nextNode = currentNode.nextNode;
                    if (prevNode != null)
                        prevNode.nextNode = nextNode;
                    else
                        this.head = nextNode;
                    if (nextNode != null)
                        nextNode.prevNode = prevNode;
                }
                currentNode = currentNode.nextNode;
            }
        }
    }


    void print() {
        DLLNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "<->");
            currentNode = currentNode.nextNode;
        }
        System.out.print("null\n");
    }

    void printReverse() {
        DLLNode currentNode = head;
        if (head == null)
            System.out.println("DLL is empty.");
        else {
            DLLNode prevNode = null;
            while (currentNode != null) {
                prevNode = currentNode;
                currentNode = currentNode.nextNode;
            }
            while (prevNode != null) {
                System.out.print(prevNode.data + "<->");
                prevNode = prevNode.prevNode;
            }
        }
        System.out.print("null\n");
    }

}