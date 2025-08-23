public class Main {
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        // Empty Stacks and Queue
        tms.readTasks();
        System.out.println("-------------------");

        // Empty Peek
        tms.peekTask();
        System.out.println("-------------------");

        // Empty Read
        tms.readTasks();
        System.out.println("-------------------");

        // Empty Task in Queue Completion
        tms.taskFinished();
        System.out.println("-------------------");

        // Empty Task in Stack Completion
        tms.removeTask();
        System.out.println("-------------------");

        // Adding Tasks (Queue)
        tms.addTask("Task 1", "Laundy", 3);
        tms.addTask("Task 2", 2); // No description: description = No description
        tms.addTask("Task 3", "Cooking"); // No priority number: priority = 0

        // Pushing Tasks (Stack)
        tms.pushTask("Task 1", "Assignment 1", 1);
        tms.pushTask("Task 2", 2); // No description: description = No description
        tms.pushTask("Task 3", "Kuromi"); // No priority number: priority = 0

        // Reading Tasks
        tms.readTasks();
        System.out.println("-------------------");

        // Task Completion (Queue)
        tms.taskFinished();
        tms.taskFinished();
        tms.readTasks();
        System.out.println("-------------------");

        // Task Completion (Stack)
        tms.removeTask();
        tms.removeTask();
        tms.readTasks();
        System.out.println("-------------------");
    }
}
