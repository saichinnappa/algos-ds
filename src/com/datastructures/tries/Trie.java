package com.datastructures.tries;

import java.util.ArrayList;

class Trie {
    public TrieNode root; //Root Node
    String word = "";
    private int totalWordsCount;
    private String alphabets = "abcdefghijklmnopqrstuvwkyz";
    private ArrayList<String> wordsList = new ArrayList<>();

    //Constructor
    Trie() {
        root = new TrieNode();
    }

    //Function to get the index of a character 'x'
    public int getIndex(char x) {
        return x - 'a';  // the index is based on the position of character in alphabets
    }

    //Function to insert a key in the Trie
    public void insert(String key) {
        if (key == null) //Null keys are not allowed
        {
            System.out.println("Null Key can not be Inserted!");
            return;
        }
        key = key.toLowerCase(); //Keys are stored in lowercase
        TrieNode currentNode = this.root;
        int index = 0; //to store character index

        //Iterate the Trie with given character index,
        //If it is null, then simply create a TrieNode and go down a level
        for (int level = 0; level < key.length(); level++) {
            index = getIndex(key.charAt(level));
            if (currentNode.children[index] == null) {
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
        }
        //Mark the end character as leaf node
        currentNode.isEndWord = true;
    }

    public boolean search(String key) {
        key = key.toLowerCase(); //Keys are stored in lowercase
        TrieNode currentNode = this.root;
        int index = 0; //to store character index
        for (int level = 0; level < key.length(); level++) {
            index = getIndex(key.charAt(level));
            if (currentNode.children[index] == null) return false;
            currentNode = currentNode.children[index];
        }
        return currentNode.isEndWord;
    }

    public int totalWordsCount(TrieNode root) {
        if (root.isEndWord) {
            totalWordsCount++;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                totalWordsCount(root.children[i]);
            }
        }
        return totalWordsCount;
    }

    public ArrayList<String> totalWords(TrieNode root) {
        if (root.isEndWord) {
            wordsList.add(word);
            word = "";
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                word += alphabets.charAt(i);
                totalWords(root.children[i]);
            }
        }
        return wordsList;
    }


//    public boolean delete(String key) {
//
//    }
}
