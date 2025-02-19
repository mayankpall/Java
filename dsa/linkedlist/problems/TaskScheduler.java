package com.bridgelabz.dsa.linkedlist.problems;



import java.util.Date;

class Task{
    //Task ID, Task Name, Priority, and Due Date.
    public String id;
    public String name;
    public String priority;
    public Date dueDate;

    Task(String id, String name, String priority, Date dueDate){
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }

}


class TaskNode {
    Task task;
    TaskNode next;

    TaskNode(Task task){
        this.task = task;
        this.next = this;
    }
}

/*
Add a task at the beginning, end, or at a specific position in the circular list.
Remove a task by Task ID.
View the current task and move to the next task in the circular list.
Display all tasks in the list starting from the head node.
Search for a task by Priority.
Hint:
Use a circular linked list where the last node’s next pointer points back to the first node, creating a circular structure.
Ensure that the list loops when traversed from the head node, so tasks can be revisited in a circular manner.
When deleting or adding tasks, maintain the circular nature by updating the appropriate next pointers.
 */

public class TaskScheduler {
    private TaskNode head;

    public void addAtBeginning(){
        if(head == null){

        }
    }


}
