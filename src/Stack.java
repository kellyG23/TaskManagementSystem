public class Stack {
    private LinkedList list;

    public Stack() {
        list = new LinkedList();
    }

    public void push(String item) {
        list.addfirst(item);
        System.out.println("Pushed: " + item);
    }
    public String pop() {
        if(list.size == 0) {
            System.out.println("Stack is empty. Cannot pop");
            return null;
        }

        String poppedData = list.removefirst();
        System.out.println("Popped: " + poppedData);
        return poppedData;
    }
    public String peek() {
        if(list.size == 0) {
            System.out.println("Stack is empty.");
            return null;
        }
        String peekData = list.head.getData();
        System.out.println("Peeked: " + peekData);
        return peekData;
    }
}

