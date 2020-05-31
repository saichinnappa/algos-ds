package com.practice.leetcode.easy.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Node root = new Node();
        root.val = 1;
        Node node1 = new Node();
        node1.val = 3;
        Node node2 = new Node();
        node2.val = 2;
        Node node3 = new Node();
        node3.val = 4;
        Node node4 = new Node();

        List<Node> childrenOfRoot = new ArrayList<>();
        childrenOfRoot.add(node3);
        childrenOfRoot.add(node2);
        childrenOfRoot.add(node4);
        root.children = childrenOfRoot;
        List<Node> childrenOfThree = new ArrayList<>();
        Node node5 = new Node();
        node5.val = 5;
        Node node6 = new Node();
        node6.val = 6;
        childrenOfThree.add(node5);
        childrenOfThree.add(node6);
        node3.children = childrenOfThree;
        System.out.println(Arrays.toString(solution.postorder(root).toArray()));
    }

    public List<Integer> postorder(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            output.add(node.val);
            for (Node item : node.children) {
                if (item != null) {
                    stack.add(item);
                }
            }
        }
        return output;
    }
}
