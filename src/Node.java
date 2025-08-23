public class Node {
    String task;
    String description;
    int priority;

    Node next; // Reference to the next node in the sequence

    // Constructor
    public Node(String task, String description, int priority) {
        this.task = task;
        this.description = description;
        this.priority = priority;
        this.next = null; // Initially, no next node
    }
}