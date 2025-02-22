package com.bridgelabz.dsa.linkedlist.problems;


// Process class: Holds process details
class Process {
    int pid;          // Process ID
    int burstTime;    // Burst Time
    int priority;     // Priority

    public Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}

// Node class for Circular Linked List
class ProcessNode {
    Process process;  // Holds Process object
    int remainingTime; // Remaining execution time
    ProcessNode next; // Circular link

    public ProcessNode(Process process) {
        this.process = process;
        this.remainingTime = process.burstTime;
        this.next = null;
    }
}

// Round Robin Scheduler using Circular Linked List
class RoundRobinScheduler {
    private ProcessNode head = null;
    private ProcessNode tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process to the circular queue
    public void addProcess(int pid, int burstTime, int priority) {
        Process newProcess = new Process(pid, burstTime, priority);
        ProcessNode newNode = new ProcessNode(newProcess);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Execute Round Robin Scheduling
    public void execute() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int currentTime = 0;
        int completedProcesses = 0;
        int totalProcesses = countProcesses();
        int[] waitingTime = new int[totalProcesses];
        int[] turnaroundTime = new int[totalProcesses];

        ProcessNode current = head;

        System.out.println("\nExecuting Round Robin Scheduling...");
        while (completedProcesses < totalProcesses) {
            if (current.remainingTime > 0) {
                int executionTime = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= executionTime;
                currentTime += executionTime;

                System.out.println("Process " + current.process.pid + " executed for " + executionTime + " ms. Remaining: " + current.remainingTime);

                if (current.remainingTime == 0) {
                    completedProcesses++;
                    turnaroundTime[current.process.pid - 1] = currentTime;
                    waitingTime[current.process.pid - 1] = turnaroundTime[current.process.pid - 1] - current.process.burstTime;
                }
            }
            current = current.next; // Move to the next process
        }

        displayResults(waitingTime, turnaroundTime, totalProcesses);
    }

    // Count total processes
    private int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    // Display results
    private void displayResults(int[] waitingTime, int[] turnaroundTime, int totalProcesses) {
        System.out.println("\nProcess Execution Results:");
        System.out.println("PID\tPriority\tWaiting Time\tTurnaround Time");
        int totalWaiting = 0, totalTurnaround = 0;
        for (int i = 0; i < totalProcesses; i++) {
            totalWaiting += waitingTime[i];
            totalTurnaround += turnaroundTime[i];
            System.out.println((i + 1) + "\t" + (i + 1) + "\t\t" + waitingTime[i] + "\t\t" + turnaroundTime[i]);
        }

        System.out.println("\nAverage Waiting Time: " + (double) totalWaiting / totalProcesses);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaround / totalProcesses);
    }
}

// Main Class
public class RoundRobinAlgorithm {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4); // Time Quantum = 4ms

        // Adding processes (PID, Burst Time, Priority)
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 3);

        // Execute Round Robin Scheduling
        scheduler.execute();
    }
}
