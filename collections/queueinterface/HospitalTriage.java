package com.bridgelabz.collections.queueinterface;

import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {
    public static void main(String[] args) {

        PriorityQueue<Patient> queue = new PriorityQueue<>(new Comparator<Patient>() {
            public int compare(Patient p1, Patient p2) {
                return Integer.compare(p2.severity, p1.severity);
            }
        });


        queue.add(new Patient("Mayank", 3));
        queue.add(new Patient("Arnav", 5));
        queue.add(new Patient("Vibhor", 2));

        while (!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println("Treating patient: " + p.name + " (Severity: " + p.severity + ")");
        }
    }
}
