package com.beans;

public class Job {
    int workerId;
    String task;
    String date;

    public Job(int workerId, String task, String date) {
        this.workerId = workerId;
        this.task = task;
        this.date = date;
    }

    public void display() {
        System.out.println("Worker ID: " + workerId +
                " | Task: " + task +
                " | Date: " + date);
    }
}
