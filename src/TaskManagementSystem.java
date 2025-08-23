public class TaskManagementSystem {
    Stack taskStack = new Stack();
    Queue taskQueue = new Queue();

    // Push and Enqueue
    public void addTask(String name, String description, int priority) {
        taskQueue.enqueue(name, description, priority);
    }
    public void addTask(String name, String description) {
        int priority = 0;
        taskQueue.enqueue(name, description, priority);
    }
    public void addTask(String name, int priority) {
        String description = "No description";
        taskQueue.enqueue(name, description, priority);
    }
    public void addTask(String name) {
        int priority = 0;
        String description = "No description";
        taskQueue.enqueue(name, description, priority);
    }
    
    public void pushTask(String name, String description, int priority) {
        taskStack.push(name, description, priority);
    }
    public void pushTask(String name, String description) {
        int priority = 0;
        taskStack.push(name, description, priority);
    }
    public void pushTask(String name, int priority) {
        String description = "No description";
        taskStack.push(name, description, priority);
    }
    public void pushTask(String name) {
        int priority = 0;
        String description = "No description";
        taskStack.push(name, description, priority);
    }

    // Pop and Dequeue
    public void taskFinished() {
        Node task = taskQueue.dequeue();
        if (task != null) {
            System.out.println("Finished Task: " + task.task);
        }
        else {
            System.out.println("No tasks to remove.");
        }
        System.out.println();
    }

    public void removeTask() {
        Node task = taskStack.pop();
        if (task != null) {
            System.out.println("Removed Task: " + task.task);
        }
        else {
            System.out.println("No tasks to remove.");
        }
        System.out.println();
    }

    // Read
    public void readTasks() {
        System.out.println("Task Queue:");
        if (taskQueue.isEmpty()) {
            System.out.println("Queue is empty.");
            System.out.println();
        }
        else
            taskQueue.read();


        System.out.println("Task Stack:");
        if (taskStack.isEmpty()) {
            System.out.println("Stack is empty.");
            System.out.println();

        }
        else
            taskStack.read();
    }

    // Peek
    public void peekTask() {
        Node task = taskStack.peek();
        if (task != null) {
            System.out.println("Top of Stack: " + task.task);
        }

        Node task2 = taskQueue.peek();
        if (task2 != null) {
            System.out.println("Top of Queue: " + task2.task);
        }

        System.out.println();
    }
}
