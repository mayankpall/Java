package com.bridgelabz.dsa.linkedlist.problems;

import java.util.Date;

class Task {
    public int id;
    public String name;
    public int priority;
    public Date dueDate;

    Task(int id, String name, int priority, Date dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public void displayTask() {
        System.out.println("Task ID: " + id + ", Name: " + name + ", Priority: " + priority + ", Due: " + dueDate);
    }
}

class TaskNode {
    Task task;
    TaskNode next;

    TaskNode(Task task) {
        this.task = task;
        this.next = this;
    }
}

public class TaskScheduler {
    private TaskNode head, tail;
    private TaskNode currentTask = null;

    // Add Task at the Beginning
    public void addAtBeginning(Task task) {
        TaskNode taskNode = new TaskNode(task);
        if (head == null) {
            head = tail = taskNode;
        } else {
            taskNode.next = head;
            head = taskNode;
            tail.next = head;
        }
    }

    // Add Task at the End
    public void addAtEnd(Task task) {
        TaskNode taskNode = new TaskNode(task);
        if (head == null) {
            head = tail = taskNode;
        } else {
            tail.next = taskNode;
            tail = taskNode;
            taskNode.next = head;
        }
    }

    // Add Task at Specific Position
    public void addSpecificPosition(int position, Task task) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtBeginning(task);
            return;
        }

        TaskNode current = head;
        int count = 1;

        do {
            if (count == position - 1) {
                TaskNode node = new TaskNode(task);
                node.next = current.next;
                current.next = node;
                if (current == tail) {
                    tail = node;
                }
                return;
            }
            current = current.next;
            count++;
        } while (current != head);

        System.out.println("Position exceeds list size.");
    }

    // Remove Task by ID
    public void removeTaskById(int id) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        TaskNode current = head, prev = tail;
        boolean found = false;

        do {
            if (current.task.id == id) {
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No task found with ID " + id);
            return;
        }

        // Deleting head node
        if (current == head) {
            if (head == tail) { // Only one node
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
        }
        // Deleting any other node
        else {
            prev.next = current.next;
            if (current == tail) {
                tail = prev;
            }
        }

        System.out.println("Task with ID " + id + " removed.");
    }

    // Display Current Task and Move to Next
    public void displayCurrentTaskAndMove() {
        if (currentTask == null) {
            currentTask = head;
        }
        if (currentTask != null) {
            System.out.print("Current Task: ");
            currentTask.task.displayTask();
            currentTask = currentTask.next;
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Display All Tasks
    public void displayTask() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        TaskNode current = head;
        do {
            current.task.displayTask();
            current = current.next;
        } while (current != head);
    }

    // Search Task by Priority
    public void searchTask(int priority) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        TaskNode current = head;
        boolean found = false;

        do {
            if (current.task.priority == priority) {
                current.task.displayTask();
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No task found with the given priority.");
        }
    }

    public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler();

        Task taskOne = new Task(1, "Study", 2, new Date(2025 - 1900, 11, 23));
        Task taskTwo = new Task(2, "Sleep", 5, new Date(2025 - 1900, 0, 20));
        Task taskThree = new Task(3, "Calling", 1, new Date(2025 - 1900, 0, 21));

        taskScheduler.addAtBeginning(taskOne);
        taskScheduler.addAtEnd(taskTwo);
        taskScheduler.addSpecificPosition(2, taskThree);

        System.out.println("\nDisplaying all tasks:");
        taskScheduler.displayTask();

        System.out.println("\nRemoving task with ID 2:");
        taskScheduler.removeTaskById(2);
        taskScheduler.displayTask();

        System.out.println("\nDisplaying current task and moving:");
        taskScheduler.displayCurrentTaskAndMove();
        taskScheduler.displayCurrentTaskAndMove();

        System.out.println("\nSearching for priority 1 tasks:");
        taskScheduler.searchTask(1);
    }
}
