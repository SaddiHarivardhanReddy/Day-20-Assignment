package com.codegnan.oopexamples;
import java.util.Scanner;

public class FitLifeGym {
    int steps;

    void setSteps(int s) {
        steps = s;
    }

    void displayMessage() {
        if (steps > 10000) {
            System.out.println("Excellent!");
        } else if (steps >= 5000) {
            System.out.println("Good job!");
        } else {
            System.out.println("Keep going!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        FitLifeGym tracker = new FitLifeGym();
        tracker.setSteps(s);
        tracker.displayMessage();

        sc.close();
    }
}
