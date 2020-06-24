package practice.datastructures;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

public class SinglyLinkedList {

    Node root;
    Node tail;

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node root = new Node(10);
        singlyLinkedList.root = root;
        singlyLinkedList.tail = root;
        Node node1 = new Node(20);
        singlyLinkedList.insertAtTail(node1);
        Node node2 = new Node(30);
        singlyLinkedList.insertAtTail(node2);
        Node node3 = new Node(40);
        singlyLinkedList.insertAtTail(node3);
//        Node node4 = new Node(50);
//        singlyLinkedList.insertAtTail(node4);
//        Node node5 = new Node(35);
//        singlyLinkedList.insertAfter(node5, node4);
//        singlyLinkedList.delete(node3);
//        singlyLinkedList.delete(node5);
//        singlyLinkedList.delete(root);
        singlyLinkedList.print();
        singlyLinkedList.reverseList();
        singlyLinkedList.print();

    }

    void insert(Node newNode) {
        Node currentNode = this.root;
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.next = newNode;
                break;
            }
            currentNode = currentNode.next;
        }
        this.tail = currentNode;
    }

    void insertAfter(Node newNode, Node afterNode) {
        Node currentNode = this.root;
        Node temp = null;
        while (currentNode != null) {
            if (currentNode.data == afterNode.data) {
                temp = currentNode.next;
                currentNode.next = newNode;
                newNode.next = temp;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    void insertAtTail(Node newNode) {
        this.tail.next = newNode;
        this.tail = newNode;
    }

    void delete(Node delNode) {
        Node currentNode = this.root;
        if (currentNode.data == delNode.data) {
            this.root = currentNode.next;
            return;
        }
        Node prev = null;
        while (currentNode != null) {
            if (currentNode.data == delNode.data) {
                if (currentNode.next == null)
                    prev.next = null;
                else
                    prev.next = currentNode.next;
            }
            prev = currentNode;
            currentNode = currentNode.next;
        }
    }

    void reverseList() {
        Node currentNode = this.root;
        Node prev = null;
        Node next = null;
        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
        }
        this.root = prev;
    }

    void print() {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> tesult = new ArrayList<String>();
        String[] a = (String[]) tesult.toArray();
        Node currentNode = this.root;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("null\n");
    }
}
