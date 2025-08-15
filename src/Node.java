public class Node {
    int data; // The data stored in this node
    Node next; // Reference to the next node in the sequence

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null; // Initially, no next node
    }

    // Getter for data
    public int getData() {
        return data;
    }

    // Setter for data
    public void setData(int data) {
        this.data = data;
    }

    // Getter for next node
    public Node getNext() {
        return next;
    }

    // Setter for next node
    public void setNext(Node next) {
        this.next = next;
    }
}