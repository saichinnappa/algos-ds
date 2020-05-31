package com.datastructures.trees.impl;

public class Node {
    int value;
    Node leftChild;
    Node rightChild;

    Node(int data) {
        this.value = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}
