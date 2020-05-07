package com.datastructures.trees.impl;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(2);
        binarySearchTree.add(2);
        binarySearchTree.add(3);
        binarySearchTree.add(4);
        binarySearchTree.add(5);
        binarySearchTree.print(binarySearchTree.root);
        binarySearchTree.addRecursive(3);
        binarySearchTree.addRecursive(0);
        binarySearchTree.addRecursive(-1);
        binarySearchTree.addRecursive(5);
        binarySearchTree.addRecursive(-3);
        binarySearchTree.addRecursive(6);
        binarySearchTree.print(binarySearchTree.root);
    }
}
