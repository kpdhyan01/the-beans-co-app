package com.beans;

import java.util.*;

public class MainApp {

    static ArrayList<Worker> workers = new ArrayList<>();
    static ArrayList<Payment> payments = new ArrayList<>();
    static ArrayList<Job> jobs= new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int idCounter = 1;

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- The Beans Co. ---");
            System.out.println("1. Add Worker");
            System.out.println("2. View Workers");
            System.out.println("3. Add Payment");
            System.out.println("4. View Payments");
            System.out.println("5. Rate Worker");
            System.out.println("6. Add Job");
            System.out.println("7. View Jobs");
            System.out.println("8. Search by Skill");
            System.out.println("9. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: addWorker(); break;
                case 2: viewWorkers(); break;
                case 3: addPayment(); break;
                case 4: viewPayments(); break;
                case 5: rateWorker(); break;
                case 6: addJob(); break;
                case 7: viewJobs(); break;
                case 8: searchBySkill(); break;
                case 9: System.exit(0);
            }
        }
    }

    static void addWorker() {
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter skills: ");
        String skills = sc.nextLine();

        Worker w = new Worker(idCounter++, name, phone, skills);
        workers.add(w);

        System.out.println("Worker Added!");
    }

    static void viewWorkers() {
        System.out.println("\n--- Workers ---");
        for (Worker w : workers) {
            w.display();
        }
    }

    static void addPayment() {
        System.out.print("Enter Worker ID: ");
        int id = sc.nextInt();

        System.out.print("Enter quantity (hours/kg): ");
        double qty = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        Payment p = new Payment(id, qty, rate);
        payments.add(p);

        System.out.println("Payment Added! Total = " + p.total);
    }
    
    static void rateWorker() {
        System.out.print("Enter Worker ID: ");
        int id = sc.nextInt();

        for (Worker w : workers) {
            if (w.id == id) {
                System.out.print("Enter rating (1 to 5): ");
                double r = sc.nextDouble();

                w.rating = r;

                System.out.println("Rating updated!");
                return;
            }
        }

        System.out.println("Worker not found!");
    }
    
    static void addJob() {
        System.out.print("Enter Worker ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter task (Picking/Weeding/etc): ");
        String task = sc.nextLine();

        System.out.print("Enter date: ");
        String date = sc.nextLine();

        Job j = new Job(id, task, date);
        jobs.add(j);

        System.out.println("Job Assigned!");
    }
    
    static void searchBySkill() {
        sc.nextLine();
        System.out.print("Enter skill: ");
        String skill = sc.nextLine();

        System.out.println("\n--- Matching Workers ---");
        for (Worker w : workers) {
            if (w.skills.toLowerCase().contains(skill.toLowerCase())) {
                w.display();
            }
        }
    }

    static void viewPayments() {
        System.out.println("\n--- Payments ---");

        for (Payment p : payments) {
            String name = "Unknown";

            for (Worker w : workers) {
                if (w.id == p.Workerid) {
                    name = w.name;
                    break;
                }
            }

            System.out.println("Worker: " + name +
                    " | Qty: " + p.quantity +
                    " | Total: " + p.total);
        }
    }
    static void viewJobs() {
        System.out.println("\n--- Jobs ---");

        for (Job j : jobs) {
            String name = "Unknown";

            for (Worker w : workers) {
                if (w.id == j.workerId) {
                    name = w.name;
                    break;
                }
            }

            System.out.println("Worker: " + name +
                    " | Task: " + j.task +
                    " | Date: " + j.date);
        }
    }
        
    }
