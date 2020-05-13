package com.datastructures.tries;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("Hello");
        trie.insert("World");
        System.out.println(trie.search("hellop"));
        System.out.println(trie.totalWords(trie.root));
    }
}
