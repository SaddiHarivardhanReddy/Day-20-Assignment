package com.codegnan.oopexamples;
import java.util.Scanner;

public class StudentMarksCalculator {
    String name;
    int[] marks;

    void setDetails(String n, int[] m) {
        name = n;
        marks = m;
    }

    int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    double calculateAverage() {
        int total = calculateTotal();
        return (double) total / marks.length;
    }

    void displayDetails() {
        int total = calculateTotal();
        double average = calculateAverage();
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        StudentMarksCalculator s = new StudentMarksCalculator();
        s.setDetails(name, marks);
        s.displayDetails();

        sc.close();
    }
}

