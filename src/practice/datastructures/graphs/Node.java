package practice.datastructures.graphs;

public class Node {
    public Node prev;
    public Node next;
    public int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
