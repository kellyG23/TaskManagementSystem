public class Main {
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();
        // LinkedList
        // Store tasks (w/ name description and priority)
        LinkedList list = new LinkedList();

        // insertion, reading, deletion, searching
        list.add("A");
        list.add("B");
        list.read(); // [ A B ]
        list.search("ABC"); // ABC not found
        list.delete("A");
        list.read(); // [ B ]

        // Stack
        // Push Pop Peek



        // Queue
        // Extends LinkedList
        // Queue Dequeue
    }
}
