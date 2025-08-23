public class Queue extends LinkedList {
    public void enqueue(String taskName, String description, int priority) {
        add(taskName, description, priority);
    }

    public Node dequeue() {
        return delete();
    }

    public Node peek() {
        if (head == null) {
            System.out.println("Queue is empty, nothing to peek.");
            return null;
        }

        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
