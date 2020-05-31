package practice.datastructures.graphs;

public class BinarySearchTree {
    BSTNode root;

    BinarySearchTree(BSTNode newNode) {
        this.root = newNode;
    }

    public static void main(String[] args) {
//        BSTNode root = new BSTNode(50);
//        BinarySearchTree binarySearchTree = new BinarySearchTree(root);
//        BSTNode newNode1 = new BSTNode(20);
//        BSTNode newNode2 = new BSTNode(70);
//        BSTNode newNode3 = new BSTNode(30);
//        BSTNode newNode4 = new BSTNode(40);
//        BSTNode newNode5 = new BSTNode(90);
//        BSTNode newNode6 = new BSTNode(80);
//        binarySearchTree.insertNewNode(root, newNode1);
//        binarySearchTree.insertNewNode(root, newNode2);
//        binarySearchTree.insertNewNode(root, newNode3);
//        binarySearchTree.insertNewNode(root, newNode4);
//        binarySearchTree.insertNewNode(root, newNode5);
//        binarySearchTree.insertNewNode(root, newNode6);
//        binarySearchTree.printTree(root);
//        System.out.println("\n" + binarySearchTree.search(90));
        test();
    }

    static void test() {
        System.out.println(Math.pow(2, 0));
    }

    public void insertNewNode(BSTNode root, BSTNode newNode) {
        if (root == null) {
            return;
        } else {
            if (newNode.data > root.data) {
                insertNewNode(root.rightChild, newNode);
                if (root.rightChild == null)
                    root.rightChild = newNode;
            } else if (newNode.data < root.data) {
                insertNewNode(root.leftChild, newNode);
                if (root.leftChild == null)
                    root.leftChild = newNode;
            }
        }

    }

//    boolean delete(int data) {
//        BSTNode currentNode = root;
//        while (currentNode != null) {
//            if (root.data == data) {
//                root
//            }
//        }
//    }

    boolean search(int data) {
        if (root == null)
            System.out.println("BST is empty!");
        BSTNode currentNode = root;
        while (currentNode != null) {
            BSTNode rightChild = currentNode.rightChild;
            BSTNode leftChild = currentNode.leftChild;
            if (currentNode.data == data)
                return true;
            if (data > currentNode.data) {
                currentNode = rightChild;
            } else {
                currentNode = leftChild;
            }
        }
        return false;
    }

    public void printTree(BSTNode current) {
        if (current == null) return;
        System.out.print(current.data + ",");
        printTree(current.leftChild);
        printTree(current.rightChild);
        StringBuilder val = new StringBuilder();
        int result = 0;
        char[] charArray = val.toString().toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            result += Math.pow(2, i) * charArray[i];
        }
    }

}
