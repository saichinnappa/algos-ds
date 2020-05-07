package com.datastructures.trees.impl;

public class BinarySearchTree {
    Node root;

    boolean add(int val) {
        Node currentNode = this.root;
        if (currentNode == null) {
            this.root = new Node(val);
            return true;
        }
        while (currentNode != null) {
            Node leftChild = currentNode.leftChild;
            Node rightChild = currentNode.rightChild;
            if (val <= currentNode.data) {
                if (leftChild == null) {
                    leftChild = new Node(val);
                    currentNode.leftChild = leftChild;
                    return true;
                }
                currentNode = leftChild;
            } else {
                if (rightChild == null) {
                    rightChild = new Node(val);
                    currentNode.rightChild = rightChild;
                    return true;
                }
                currentNode = rightChild;
            }
        }
        return false;
    }

    Node recursive(Node currentNode, int val) {
        if (currentNode == null) {
            return new Node(val);
        }
        if (val <= currentNode.data) {
            currentNode.leftChild = recursive(currentNode.leftChild, val);
        } else {
            currentNode.rightChild = recursive(currentNode.rightChild, val);
        }
        return currentNode;
    }

    public boolean addRecursive(int value) {

        root = recursive(this.root, value);
        return true;
    }

    void print(Node node) {
        if (node == null) {
            return;
        }
        String leftVal = node.leftChild == null ? "null" : String.valueOf(node.leftChild.data);
        String rightVal = node.rightChild == null ? "null" : String.valueOf(node.rightChild.data);
        System.out.println("Parent -> " + node.data + " | Left -> " + leftVal + " | Right -> " + rightVal);
        print(node.leftChild);
        print(node.rightChild);
    }

}
