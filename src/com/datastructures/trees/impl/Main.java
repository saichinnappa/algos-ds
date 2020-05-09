package com.datastructures.trees.impl;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.add(2);
//        binarySearchTree.add(2);
//        binarySearchTree.add(3);
//        binarySearchTree.add(4);
//        binarySearchTree.add(5);
//        binarySearchTree.print(binarySearchTree.root);
        binarySearchTree.addRecursive(50);
        binarySearchTree.addRecursive(20);
        binarySearchTree.addRecursive(10);
        binarySearchTree.addRecursive(70);
        binarySearchTree.addRecursive(40);
        binarySearchTree.addRecursive(90);
        binarySearchTree.addRecursive(60);
        binarySearchTree.addRecursive(5);
        binarySearchTree.addRecursive(0);
        System.out.println("PRE-TRAVERSAL: ");
        binarySearchTree.preTraverse(binarySearchTree.root);
        System.out.println("\nIN-TRAVERSAL: ");
        binarySearchTree.inTraverse(binarySearchTree.root);
        System.out.println("\nPOST-TRAVERSAL: ");
        binarySearchTree.postTraverse(binarySearchTree.root);
        System.out.println("\n##### TREE - BEFORE DELETION #####");
        System.out.println("Root -> " + binarySearchTree.root.data);
        binarySearchTree.print(binarySearchTree.root);
        System.out.println("TREE HEIGHT: " + binarySearchTree.findTreeHeight(binarySearchTree.root));
        binarySearchTree.findAncestors(binarySearchTree.root, 40);
        System.out.println("MAX-VALUE: " + binarySearchTree.findKthMax(binarySearchTree.root, 5).data);
        System.out.println("MIN-VALUE: " + binarySearchTree.findMinRecursive(binarySearchTree.root));
        System.out.println("Deleting Node: 70");
        binarySearchTree.delete(70);
        System.out.println("##### TREE - AFTER DELETION #####");
        System.out.println("Root -> " + binarySearchTree.root.data);
        binarySearchTree.print(binarySearchTree.root);
        System.out.println("Search element found: " + binarySearchTree.search(30));
    }
}
