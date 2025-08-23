public class LinkedList {
    Node head = null;
    int size = 0;

    String addfirst(String item) {
        Node newNode = new Node(item);
        newNode.setNext(head);
        head = newNode;
        size++;
        return item;
    }

    String removefirst() {
        if (head == null) {
            System.out.println("List is empty. Cannot remove.");
            return null;
        }
        String removeData = head.getTask();
        head = head.getNext();
        size--;
        return removeData;
    }

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
