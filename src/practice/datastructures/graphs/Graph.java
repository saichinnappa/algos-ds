package practice.datastructures.graphs;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    public DoublyLinkedList<Integer>[] adjacencyList;
    public int vertices;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new DoublyLinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            this.adjacencyList[i] = new DoublyLinkedList<>();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(1, 3);
        graph.insertEdge(1, 4);
        graph.insertEdge(2, 4);
        graph.insertEdge(2, 5);


//        graph.insertEdge(0, 2);
//        graph.insertEdge(0, 5);
//
//        graph.insertEdge(2, 0);
//        graph.insertEdge(2, 3);
//        graph.insertEdge(2, 4);
//
//        graph.insertEdge(3, 2);
//        graph.insertEdge(3, 5);
//        graph.insertEdge(3, 6);
//
//        graph.insertEdge(4, 2);
//        graph.insertEdge(4, 6);
//
//        graph.insertEdge(5, 0);
//        graph.insertEdge(5, 3);
//        graph.insertEdge(5, 6);
//
//        graph.insertEdge(6, 5);
//        graph.insertEdge(6, 3);
//        graph.insertEdge(6, 7);
//        graph.insertEdge(6, 8);
//        graph.insertEdge(6, 4);
//
//        graph.insertEdge(7, 6);
//        graph.insertEdge(7, 8);
//
//        graph.insertEdge(8, 6);
//        graph.insertEdge(8, 7);


//        0 - 1, 0 - 4,
//                1 - 2, 1 - 3,
//                4 - 2, 4 - 5,
//                2 - 5,
//                5 - 6, 5 - 7, 5 - 3,
//                6 - 7
//        graph.insertEdge(4, 2);

//        graph.insertEdge(3, 0);
//        graph.printGraph();
//        graph.breadthFirstSearch(1);
//        Queue queue = new Queue(4);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.print();
//        queue.dequeue();
//        queue.dequeue();
//        queue.print();
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.dequeue();
//        queue.dequeue();
//        queue.enqueue(60);
//        queue.enqueue(70);
//        queue.print();
//        System.out.println(graph.depthFirstSearch(0));
//        System.out.println(graph.breadthFirstSearchUsingQueue(0));
//        System.out.println(graph.depthFirstSearch(0));
//        graph.printGraph();
//        System.out.println(graph.totalEdgesUndirectedGraph(graph));
//        System.out.println(graph.checkPath(graph, 2, 4));
        System.out.println(graph.allNodesConnected(graph));
        System.out.println(graph.verifyOneParent(graph));
    }

    static boolean detectCycle(Graph graph) {
//        Stack stack = new Stack(graph.vertices);
//        int[] visitedNodes = new int[graph.vertices];
//        boolean[] isNodeVisited = new boolean[graph.vertices];
//        stack.push(0);
//        isNodeVisited[0] = true;
//        int i = 0;
//        while (!stack.isEmpty()) {
//            int currentNode = stack.pop();
//
//            System.out.println("Visited Nodes ->" + Arrays.toString(visitedNodes));
//            DoublyLinkedList doublyLinkedList = graph.adjacencyList[currentNode];
//            if (doublyLinkedList != null) {
//                Node node = doublyLinkedList.head;
//                visitedNodes[i] = node.data;
//                i++;
//                while (node != null) {
//
//                    if (!isNodeVisited[node.data]) {
//                        stack.push(node.data);
//                        isNodeVisited[node.data] = true;
//                    }
//                    System.out.println("Stack ->" + Arrays.toString(stack.stackArray));
//                    System.out.println("Processing Node:" + node.data);
//                    for (int j = 0; j < visitedNodes.length; j++) {
//                        if (nodedata == visitedNodes[j]) {
//                            return true;
//                        }
//                    }
//                    node = node.next;
//                }
//            }
//        }
        return false;
    }

    public int totalEdgesUndirectedGraph(Graph graph) {
        int total = 0;
        for (int i = 0; i < graph.vertices; i++) {
            DoublyLinkedList dll = graph.adjacencyList[i];
            if (dll.head != null) {
                Node currentNode = dll.head;
                while (currentNode != null) {
                    total += 1;
                    currentNode = currentNode.next;
                }
            }
        }
        return total / 2;
    }

    public void printGraph() {
        for (int i = 0; i < this.adjacencyList.length; i++) {
            System.out.print(i + ": ");
            this.adjacencyList[i].print();
        }
    }

    public void insertEdge(int source, int destination) {
        if (source <= vertices && destination <= vertices) {
            Node newNode = new Node(destination);
            this.adjacencyList[source].insertAtTail(newNode);
        }
    }

    public void breadthFirstSearchUsingSet(int source) {
        StringBuilder result = new StringBuilder();
        result.append(source);
        Set<Integer> vertexMap = new HashSet<>();
        for (int i = source; i < this.adjacencyList.length; i++) {
            DoublyLinkedList dll = this.adjacencyList[i];
            Node currentNode = dll.head;
            while (currentNode != null) {
                if (!vertexMap.contains(currentNode.data)) {
                    vertexMap.add(currentNode.data);
                    result.append(currentNode.data);
                }
                currentNode = currentNode.next;
            }
        }
        System.out.println(result.toString());
    }

    public String breadthFirstSearchUsingQueue(int source) {
        Queue queue = new Queue(vertices);
        StringBuilder result = new StringBuilder();
        queue.enqueue(source);
        for (int i = 0; i < adjacencyList.length; i++) {
            DoublyLinkedList doublyLinkedList = adjacencyList[i];
            if (doublyLinkedList != null) {
                Node currentNode = doublyLinkedList.head;
                result.append(queue.dequeue());
                while (currentNode != null) {
                    queue.enqueue(currentNode.data);
                    currentNode = currentNode.next;
                }
            }
        }
        return result.toString();
    }

    public String depthFirstSearch(int source) {
        Stack stack = new Stack(vertices);
        StringBuilder result = new StringBuilder();
        boolean[] isVisited = new boolean[vertices];
        stack.push(0);
        isVisited[0] = true;
        while (!stack.isEmpty()) {
            int currentNode = stack.pop();
            result.append(currentNode);
            DoublyLinkedList doublyLinkedList = adjacencyList[currentNode];
            if (doublyLinkedList != null) {
                Node node = doublyLinkedList.head;
                while (node != null) {
                    if (!isVisited[node.data]) {
                        stack.push(node.data);
                        isVisited[node.data] = true;
                    }
                    node = node.next;
                }
            }
        }
        return result.toString();
    }

    public boolean checkPath(Graph graph, int source, int destination) {
        Stack stack = new Stack(graph.vertices);
        stack.push(source);
        while (!stack.isEmpty()) {
            int currentNode = stack.pop();
            DoublyLinkedList doublyLinkedList = graph.adjacencyList[currentNode];
            if (doublyLinkedList.head != null) {
                Node node = doublyLinkedList.head;
                while (node != null) {
                    if (node.data == destination) {
                        return true;
                    }
                    stack.push(node.data);
                    node = node.next;
                }
            }
        }
        return false;
    }

    boolean allNodesConnected(Graph graph) {
        boolean[] nodeTraversed = new boolean[graph.vertices];
        nodeTraversed[0] = true;
        for (int i = 0; i < graph.vertices; i++) {
            DoublyLinkedList doublyLinkedList = graph.adjacencyList[i];
            if (doublyLinkedList.head != null) {
                Node currentNode = doublyLinkedList.head;
                while (currentNode != null) {
                    if (!nodeTraversed[currentNode.data]) {
                        nodeTraversed[currentNode.data] = true;
                    }
                    currentNode = currentNode.next;
                }
            }
        }
        for (boolean b : nodeTraversed) {
            if (!b)
                return false;
        }
        return true;
    }

    boolean verifyOneParent(Graph graph) {
        boolean[] nodeTraversed = new boolean[graph.vertices];
        nodeTraversed[0] = true;
        for (int i = 0; i < graph.vertices; i++) {
            DoublyLinkedList doublyLinkedList = graph.adjacencyList[i];
            if (doublyLinkedList.head != null) {
                Node currentNode = doublyLinkedList.head;
                while (currentNode != null) {
                    if (!nodeTraversed[currentNode.data]) {
                        nodeTraversed[currentNode.data] = true;
                    } else {
                        return false;
                    }
                    currentNode = currentNode.next;
                }
            }
        }
        return true;
    }


}
