package org.example.week3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", Status.TO_DO),
                new TaskItem(2, "Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", Status.COMPLETED)
        );
    }

    // Method to get all objects
    public List<TaskItem> getAllTasks() {
        return tasks;
    }

    // Method to filter tasks by status
    public List<TaskItem> getByStatus(Status status) {
        List<TaskItem> filteredTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskStatus() == status) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    // Method to find tasks with an ID greater than or equal to 2
    public List<TaskItem> getTasksWithIdGreaterThan(int id) {
        List<TaskItem> filteredTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskId() >= id) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    // Method to print descriptions using forEach and streams
    public void printTaskDescriptions() {
        tasks.forEach(task -> System.out.println(task.getTaskDescription()));
    }

    public static void main(String[] args) {
        DataStructures dataStructures = new DataStructures();

        // Print all tasks
        System.out.println("All Tasks:");
        dataStructures.getAllTasks().forEach(task -> System.out.println(task.getTaskDescription()));

        // Print tasks with a specific status
        System.out.println("\nTasks with status TO_DO:");
        dataStructures.getByStatus(Status.TO_DO).forEach(task -> System.out.println(task.getTaskDescription()));

        // Print tasks with an ID greater than or equal to 2
        System.out.println("\nTasks with ID >= 2:");
        dataStructures.getTasksWithIdGreaterThan(2).forEach(task -> System.out.println(task.getTaskDescription()));

        // Print all task descriptions using forEach and streams
        System.out.println("\nAll Task Descriptions:");
        dataStructures.printTaskDescriptions();
    }
}

class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status taskStatus;

    public TaskItem(int taskId, String taskDescription, Status taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }
}

enum Status {
    TO_DO,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}
