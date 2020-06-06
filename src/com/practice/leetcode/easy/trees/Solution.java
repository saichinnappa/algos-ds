package com.practice.leetcode.easy.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        Node root = new Node();
//        root.val = 1;
//        Node node1 = new Node();
//        node1.val = 3;
//        Node node2 = new Node();
//        node2.val = 2;
//        Node node3 = new Node();
//        node3.val = 4;
//        Node node4 = new Node();
//
//        List<Node> childrenOfRoot = new ArrayList<>();
//        childrenOfRoot.add(node3);
//        childrenOfRoot.add(node2);
//        childrenOfRoot.add(node4);
//        root.children = childrenOfRoot;
//        List<Node> childrenOfThree = new ArrayList<>();
//        Node node5 = new Node();
//        node5.val = 5;
//        Node node6 = new Node();
//        node6.val = 6;
//        childrenOfThree.add(node5);
//        childrenOfThree.add(node6);
//        node3.children = childrenOfThree;
//        System.out.println(Arrays.toString(solution.postorder(root).toArray()));

        TreeNode root = new TreeNode();
        root.val = 5;
        TreeNode node1 = new TreeNode();
        node1.val = 20;
        TreeNode node2 = new TreeNode();
        node2.val = 2;
        TreeNode node3 = new TreeNode();
        node3.val = 40;
        TreeNode node4 = new TreeNode();
        node4.val = 52;
        root.left = node1;

        node1.left = node2;
        node1.right = node3;

        node3.right = node4;
        System.out.println(solution.increasingBST(root));
    }

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList();
        inorder(root, vals);
        TreeNode ans = new TreeNode(0), cur = ans;
        for (int v : vals) {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        return ans.right;
    }

    public void inorder(TreeNode node, List<Integer> vals) {
        if (node == null) return;
        inorder(node.left, vals);
        vals.add(node.val);
        inorder(node.right, vals);
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

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val)
            return root;
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left != null && left.val == val) {
            return left;
        } else if (right != null && right.val == val) {
            return right;
        }
        if (val <= root.val && left != null) {
            return searchBST(left, val);
        }
        if (val > root.val && right != null) {
            return searchBST(right, val);
        }
        return null;
    }
}
