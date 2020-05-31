package practice.datastructures.graphs;

public class BSTNode {

    int data;
    BSTNode leftChild;
    BSTNode rightChild;

    public BSTNode(int data) {
        this.data = data;
        this.rightChild = null;
        this.leftChild = null;
    }
}
