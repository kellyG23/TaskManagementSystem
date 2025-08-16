public class LinkedList {
    Node head = null;
    int size = 0;

    void add(String name) {
        Node newNode = new Node(name);

        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }

        size++;
    }

    void read() {
        for (Node current = head; current != null; current = current.getNext()) {
            System.out.println(current.getData());
        }
    }

    void search(String name) {
        for (Node current = head; current != null; current = current.getNext()) {
            if (current.getData().equals(name)) {
                System.out.println("Found " + name);
                return;
            }
        }
        System.out.println("Not found " + name);
    }
}
