public class Queue extends LinkedList {
    
    public void enqueue(String name) {
        add(name); 
        System.out.println(name + " added to the queue");
    }

    public String dequeue() {
        if (head == null) {
            System.out.println("Queue is empty, cannot dequeue.");
            return null;
        }
        String removedData = head.getData();
        head = head.getNext();
        size--;
        System.out.println(removedData + " removed from the queue");
        return removedData;
    }

    public String peek() {
        if (head == null) {
            System.out.println("Queue is empty, nothing to peek.");
            return null;
        }
        System.out.println("Front of the queue: " + head.getData());
        return head.getData();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
