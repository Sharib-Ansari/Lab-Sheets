import java.util.Stack;

class Task {
    int taskId;
    String description;

    Task(int taskId, String description) {
        this.taskId = taskId;
        this.description = description;
    }

    void display() {
        System.out.println(taskId + " " + description);
    }
}

public class TaskStackDemo {
    public static void main(String[] args) {
        Stack<Task> stack = new Stack<>();

        stack.push(new Task(1, "Study Java"));
        stack.push(new Task(2, "Complete Assignment"));
        stack.push(new Task(3, "Practice Programs"));

        System.out.println("Completed Task:");
        stack.pop().display();

        System.out.println("Remaining Tasks:");
        for (Task t : stack) {
            t.display();
        }
    }
}