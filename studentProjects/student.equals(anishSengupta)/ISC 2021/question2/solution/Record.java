package question2.solution;

import java.util.Scanner;

public class Record {
    
    int numberOfStudents;
    String[] name;
    int[] rnk;

    Record(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
        this.name = new String[numberOfStudents];
        this.rnk = new int[numberOfStudents];
    }

    public void readvalues() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the names and ranks of " + this.numberOfStudents +" students:\n");

        for (int i = 0; i < this.numberOfStudents; i++) {
            System.out.println("\nDetails of student " + (i + 1) + ": ");
            System.out.print("Name: ");
            this.name[i] = sc.nextLine();
            System.out.print("Rank: ");
            this.rnk[i] = sc.nextInt();
            sc.nextLine();
        }

        sc.close();
    }

    public void display() {

        System.out.println("\n\nNames of " + this.numberOfStudents + " students along with their ranks:\n");

        for (int i = 0; i < this.numberOfStudents; i++) {
            System.out.println("\nDetails of student " + (i + 1) + ": ");
            System.out.println("Name: " + this.name[i]);
            System.out.println("Rank: " + this.rnk[i]);
        }
    }
}