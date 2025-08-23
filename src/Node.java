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

    public Node(String task, String description) {
        this.task = task;
        this.description = description;
        this.priority = 0;
        this.next = null; // Initially, no next node
    }

    public Node(String task, int priority) {
        this.task = task;
        this.description = "No description";
        this.priority = priority;
        this.next = null; // Initially, no next node
    }

    public Node(String task) {
        this.task = task;
        this.description = "No description";
        this.priority = 0;
        this.next = null; // Initially, no next node
    }

    // Getter for task
    public String getTask() {
        return task;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Getter for priority
    public int getPriority() {
        return priority;
    }

    // Getter for the next node
    public Node getNext() {
        return next;
    }

    // Setter for the next node
    public void setNext(Node next) {
        this.next = next;
    }
}