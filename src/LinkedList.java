public class LinkedList {
    Node head = null;
    int size = 0;

    /*kailangan daw ng function to add first on the line sa linkedlist para
    mas mabilis at magawa ko yung push and pop sa stack*/

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
        String removeData = head.getData();
        head = head.getNext();
        size--;
        return removeData;
        }

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
