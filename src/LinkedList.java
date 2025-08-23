public class LinkedList {
    Node head = null;

    void add(String task, String description, int priority) {
        Node newNode = new Node(task, description, priority);

        if (head == null) {
            head = newNode;
        }

        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node delete() {
        if (head == null)
            return null;

        Node current = head;
        head = head.next;
        return current;
    }

    public void read() {
        Node current = head;
        while (current != null) {
            System.out.println("Task: " + current.task + ", Description: " + current.description + ", Priority: " +
                    current.priority);
            current = current.next;
        }
        System.out.println();
    }
}
