package practice.datastructures.graphs;

public class DoublyLinkedList<V> {

    public Node head;
    public Node tail;

    public void insert(Node newNode) {
        Node currentNode = this.head;
        if (head == null) {
            this.head = newNode;
        } else {
            while (currentNode != null) {
                currentNode.next = newNode;
                newNode.prev = currentNode;
                currentNode = newNode.next;
                if (currentNode == null)
                    this.tail = newNode;
            }
        }
    }

    public void insertAtTail(Node newNode) {
        Node currentNode = this.head;
        if (currentNode == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
    }

    public void print() {
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "<->");
            currentNode = currentNode.next;
        }
        System.out.print("null\n");
    }

    public void printTail() {
        System.out.println("\nTail -> " + tail.data);
    }

}
