package com.codegnan.oopexamples;

import java.util.Scanner;

public class AttendanceTracker {
    static int totalAttendees = 50; 
    int eventAttendees = 0;

    static void updateTotalAttendees(int count) {
        if (count >= 0 && totalAttendees + count <= 300) {
            totalAttendees += count;
        }
    }

    void updateEventAttendees(int count) {
        if (count >= 0 && eventAttendees + count <= 300) {
            eventAttendees += count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int staticAttendees = sc.nextInt();
        int instanceAttendees = sc.nextInt();

        AttendanceTracker event = new AttendanceTracker();

        updateTotalAttendees(staticAttendees);
        event.updateEventAttendees(instanceAttendees);

        System.out.println(totalAttendees + " " + event.eventAttendees);

        sc.close();
    }
}
