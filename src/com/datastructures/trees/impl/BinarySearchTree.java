package com.datastructures.trees.impl;

public class BinarySearchTree {

    Node root;

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.insertIterative(50);
//        binarySearchTree.insertIterative(30);
//        binarySearchTree.insertIterative(70);
//        binarySearchTree.insertIterative(10);
//        binarySearchTree.print(binarySearchTree.root);

        Node root = new Node(50);
        binarySearchTree.root = root;
        Node node1 = new Node(30);
        binarySearchTree.insertRecursive(root, node1);
        Node node2 = new Node(70);
        binarySearchTree.insertRecursive(root, node2);
        Node node3 = new Node(10);
        binarySearchTree.insertRecursive(root, node3);
        binarySearchTree.print(root);
        binarySearchTree.delete(node3);
        binarySearchTree.print(root);
        System.out.println(binarySearchTree.searchRecursive(root, 10));
//        System.out.println(binarySearchTree.searchIterative(root, 70));

    }

    boolean searchRecursive(Node root, int data) {
        if (root != null) {
            if (root.value == data) {
                return true;
            } else if (data <= root.value) {
                return searchRecursive(root.leftChild, data);
            } else {
                return searchRecursive(root.rightChild, data);
            }
        }
        return false;
    }

    boolean searchIterative(Node root, int data) {
        while (root != null) {
            if (data == root.value) {
                return true;
            }
            if (data < root.value) {
                root = root.leftChild;
            }
            if (data > root.value) {
                root = root.rightChild;
            }
        }
        return false;
    }

    void insertIterative(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Node currentNode = root;
            Node newNode = new Node(data);
            while (currentNode != newNode) {
                Node leftChild = currentNode.leftChild;
                Node rightChild = currentNode.rightChild;
                if (leftChild != null && newNode.value <= leftChild.value) {
                    currentNode = leftChild;
                }
                if (rightChild != null && newNode.value > rightChild.value) {
                    currentNode = rightChild;
                }
                if (newNode.value > currentNode.value) {
                    currentNode.rightChild = newNode;
                } else {
                    currentNode.leftChild = newNode;
                }
                currentNode = newNode;
            }
        }
    }

    void insertRecursive(Node root, Node newNode) {
        if (root == null)
            return;
        else {
            if (newNode.value <= root.value) {
                insertRecursive(root.leftChild, newNode);
                if (root.leftChild == null)
                    root.leftChild = newNode;
            } else {
                insertRecursive(root.rightChild, newNode);
                if (root.rightChild == null)
                    root.rightChild = newNode;
            }
        }
    }

    void delete(Node node) {
        Node parentNode = root;
        while (root != null) {
            if (node.value == parentNode.leftChild.value) {
                parentNode.leftChild = null;
            } else if (node.value == parentNode.rightChild.value) {
                parentNode.rightChild = null;
            }
            if (node.value < root.value) {
                parentNode = root;
                root = root.leftChild;
            } else {
                parentNode = root;
                root = root.rightChild;
            }
        }
    }

    void print(Node root) {
        if (root == null)
            return;
        System.out.println(root.value);
        print(root.leftChild);
        print(root.rightChild);
    }
}
