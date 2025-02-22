package com.bridgelabz.dsa.linkedlist.problems.texteditor;


class TextNode {
    String text;
    TextNode prev, next;

    TextNode(String text) {
        this.text = text;
        this.prev = this.next = null;
    }
}

public class TextEditor {
    private TextNode head, current;
    private final int limit;
    private int size;

    public TextEditor(int limit) {
        this.limit = limit;
        this.size = 0;
    }

    public void addState(String text) {
        TextNode newNode = new TextNode(text);
        if (current != null) {
            newNode.prev = current;
            current.next = newNode;
        } else {
            head = newNode;
        }
        current = newNode;
        size++;
        if (size > limit) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public void displayState() {
        System.out.println(current != null ? current.text : "No content");
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayState();

        editor.undo();
        editor.displayState();

        editor.undo();
        editor.displayState();

        editor.redo();
        editor.displayState();
    }
}
