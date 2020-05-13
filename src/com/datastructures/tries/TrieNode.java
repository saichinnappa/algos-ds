package com.datastructures.tries;

public class TrieNode {
    boolean isEndWord;
    TrieNode[] children;

    TrieNode() {
        this.isEndWord = false;
        this.children = new TrieNode[26];
    }
}
