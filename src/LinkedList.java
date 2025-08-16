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
        System.out.print("[ ");
        for (Node current = head; current != null; current = current.getNext()) {
            System.out.print(current.getData() + " ");
        }
        System.out.println("]");
    }

    void search(String name) {
        for (Node current = head; current != null; current = current.getNext()) {
            if (current.getData().equals(name)) {
                System.out.println(name + " found");
                return;
            }
        }
        System.out.println(name + " not found");
    }

    void delete(String name) {
        if (head == null) {
            System.out.println("List is empty");
        }
        else if (head.getData().equals(name)) {
            head = head.getNext();
            size--;
        }
    }
}
