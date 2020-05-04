package com.datastructures.linkedlists.doubly.impl;

class DLLNode {
    int data;
    DLLNode prevNode;
    DLLNode nextNode;

    DLLNode(int data) {
        this.data = data;
        this.prevNode = null;
        this.nextNode = null;
    }
}