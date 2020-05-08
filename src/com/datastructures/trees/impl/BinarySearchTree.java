package com.datastructures.trees.impl;

public class BinarySearchTree {
    Node root;

    /**
     * Pre traverse - ROOT -> LEFT -> RIGHT
     */
    public void preTraverse(Node root) {
        if (root == null) return;
        System.out.print(root.data + ",");
        preTraverse(root.leftChild);
        preTraverse(root.rightChild);
    }

    /**
     * In traverse - LEFT -> ROOT -> RIGHT
     */
    public void inTraverse(Node root) {
        if (root == null) return;
        inTraverse(root.leftChild);
        System.out.print(root.data + ",");
        inTraverse(root.rightChild);
    }

    /**
     * Post Traverse - LEFT -> RIGHT -> ROOT
     */
    public void postTraverse(Node root) {
        if (root == null) return;
        postTraverse(root.leftChild);
        postTraverse(root.rightChild);
        System.out.print(root.data + ",");
    }

    boolean add(int val) {
        Node currentNode = this.root;
        if (currentNode == null) {
            this.root = new Node(val);
            return true;
        }
        while (currentNode != null) {
            Node leftChild = currentNode.leftChild;
            Node rightChild = currentNode.rightChild;
            if (val <= currentNode.data) {
                if (leftChild == null) {
                    leftChild = new Node(val);
                    currentNode.leftChild = leftChild;
                    return true;
                }
                currentNode = leftChild;
            } else {
                if (rightChild == null) {
                    rightChild = new Node(val);
                    currentNode.rightChild = rightChild;
                    return true;
                }
                currentNode = rightChild;
            }
        }
        return false;
    }

    public boolean addRecursive(int value) {
        root = recursive(this.root, value);
        return true;
    }

    Node recursive(Node currentNode, int val) {
        if (currentNode == null) {
            return new Node(val);
        }
        if (val <= currentNode.data) {
            currentNode.leftChild = recursive(currentNode.leftChild, val);
        } else {
            currentNode.rightChild = recursive(currentNode.rightChild, val);
        }
        return currentNode;
    }

    boolean search(int val) {
        Node currentNode = this.root;
        if (currentNode == null) {
            System.out.println("Tree is empty!");
        } else if (currentNode.data == val) {
            return true;
        }
        while (currentNode != null) {
            if (val == currentNode.data) {
                return true;
            }
            if (val < currentNode.data) {
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
            }

        }
        return false;
    }

    int findMin(Node root) {
        int minValue = Integer.MAX_VALUE;
        if (root == null) {
            System.out.println("There is no tree.");
        } else {
            minValue = root.data;
        }
        while (root != null) {
            Node leftChild = root.leftChild;
            if (leftChild != null && minValue >= leftChild.data) {
                minValue = leftChild.data;
            }
            root = leftChild;
        }
        return minValue;
    }

    int findMinRecursive(Node root) {
        if (root == null) {
            return -1;
        } else if (root.leftChild == null) {
            return root.data;
        } else {
            return findMinRecursive(root.leftChild); //keep traversing left child until the leaf node, the left most leaf node will be having minimum value
        }
    }

    boolean delete(int val) {
        Node currentNode = this.root;
        if (currentNode == null) {
            System.out.println("Tree is empty");
        }
        while (currentNode != null) {
            Node leftChild = currentNode.leftChild;
            Node rightChild = currentNode.rightChild;
            if (leftChild != null && val == leftChild.data) {
                currentNode.leftChild = null;
                return true;
            }
            if (rightChild != null && val == rightChild.data) {
                currentNode.rightChild = null;
                return true;
            }
            if (val < currentNode.data) {
                currentNode = currentNode.leftChild;
            } else if (val > currentNode.data) {
                currentNode = currentNode.leftChild;
            }
        }
        return false;
    }

    void print(Node node) {
        if (node == null) {
            return;
        }
        String leftVal = node.leftChild == null ? "null" : String.valueOf(node.leftChild.data);
        String rightVal = node.rightChild == null ? "null" : String.valueOf(node.rightChild.data);
        System.out.println("Parent -> " + node.data + " | Left -> " + leftVal + " | Right -> " + rightVal);
        print(node.leftChild);
        print(node.rightChild);
    }

}
