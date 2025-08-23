public class Stack extends LinkedList{
    public void push(String name, String description, int priority) {
        Node newNode = new Node(name, description, priority);

        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node pop() {
        return delete();
    }

    public Node peek() {
        if (head == null) {
            System.out.println("Stack is empty, nothing to peek.");
            return null;
        }

        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

