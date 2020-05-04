/*
Problem Statement:
------------------

Find expected time slots for two persons to meet.

Suppose you're instructed to find free time slots to arrange a meeting
scheduled for two people and they are so much busy to find free time
for themselves to meet, so they are using a software program to arrange
meetings.

[Note: take all the interval pairs in 24 hrs format. No need to
	   take fractions like 13:45 or 07:01 etc.]

Sample :
--------

person 1 | {{9, 10}, {12, 13}, {14, 16}}
person 2 | {{8, 10}, {13, 15}}

intended time slot they agreed with - within {7, 17}

Output:
-------

Arranged Time Slots => {{7, 8}, {10, 12}, {16, 17}}

*/

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        // the static method timeSlots() accepts n busy time slots
        // of a person. The parameter serves only as an index
        // of the person.

        LinkedList<Interval> btsp1=TimeSlots.timeSlots(1);

        LinkedList<Interval> btsp2=TimeSlots.timeSlots(2);

        // here we accept the intended time slot
        // within which we need to arrange the meeting
        System.out.println("\nenter intended time slot they agreed with in the same format : ");
        Interval its=new Interval(sc.nextInt(),sc.nextInt());

        // the static method freeTimeSlots() finds the free
        // time slots of a particular person.
        // parameters are the busy time slots of person i (btsp1)
        // and the intended time slot (its)
        // the returned value gives us the free time slots of person i (ftsp1)

        LinkedList<Interval> ftsp1=TimeSlots.freeTimeSlots(btsp1,its);
        LinkedList<Interval> ftsp2=TimeSlots.freeTimeSlots(btsp2,its);

        // the static method mutualFreeTimeSlots() accepts the
        // free time slots of two persons and finds the mutual
        // free time slots

        LinkedList<Interval> ats=TimeSlots.mutualFreeTimeSlots(ftsp1,ftsp2);

        // the statements below just serve presentation purpose

        System.out.print("\nArranged Time Slots => {");

        for(int i=0;i<ats.size();i++){
            System.out.print("{"+ats.get(i).getSi()+", "+ats.get(i).getEi()+"}");
            if(i<ats.size()-1)
                System.out.print(", ");
            else
                System.out.println("}");
        }
    }
}
