package com.datastructures.hashtables;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
//        hashTable.insert("0", 10);
//        hashTable.insert("48", 20);
//        System.out.println(hashTable.search("0"));
//        System.out.println(hashTable.search("48"));
//        System.out.println(hashTable.search("50"));
//        HashMap<String, String> map = new HashMap<>();
//        map.put("NewYork", "Chicago");
//        map.put("Boston", "Texas");
//        map.put("Missouri", "NewYork");
//        map.put("Texas", "Missouri");
//        System.out.println(hashTable.tracePath(map));
//        int[] arr = {4, 4, 4, 3};
//        System.out.println(hashTable.findFirstUnique(arr));

//        Node node1 = new Node(7);
//        Node node2 = new Node(14);
//        Node node3 = new Node(21);
//        Node node4 = new Node(14);
//        Node node5 = new Node(22);
//        Node node6 = new Node(7);
//        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(node1);
//        singlyLinkedList.insert(node2);
//        singlyLinkedList.insert(node3);
//        singlyLinkedList.insert(node4);
//        singlyLinkedList.insert(node5);
//        singlyLinkedList.insert(node6);
//        singlyLinkedList.print();
        RemoveDuplicatesSLL removeDuplicatesSLL = new RemoveDuplicatesSLL();
//        removeDuplicatesSLL.removeDuplicates(singlyLinkedList);
//        singlyLinkedList.print();
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int value = 27;
        int[] result = removeDuplicatesSLL.findSum(arr, value);
        System.out.println(Arrays.toString(result));
    }
}
