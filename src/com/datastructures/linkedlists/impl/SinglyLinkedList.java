package com.datastructures.linkedlists.impl;

class SinglyLinkedList {

    Node head;

    SinglyLinkedList(Node head){
        this.head = head;
    }

    void insert(Node newNode){
        Node currentNode = head;
        if(head == null)
            head = newNode;
        else{
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    void insertAfter(Node previousNode, Node newNode){
        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.data == previousNode.data){
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                break;
            } else {
                currentNode = currentNode.next;
            }
        }
    }

    void delete(Node delNode){
        Node prevNode = head;
        Node nextNode = head.next;
        if(head.data == delNode.data){
            head = nextNode;
        }
        else{
            while(nextNode != null){
                if(nextNode.data == delNode.data){
                    prevNode.next = delNode.next;
                    break;
                } else{
                    prevNode = nextNode;
                    nextNode = nextNode.next;
                }
            }
        }
    }

    void print(SinglyLinkedList linkedList){
        Node currentNode = linkedList.head;
        while(currentNode != null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

}
