// create a program that implements a simple mobile phone with the
// following capabilities. Able to store, modify, remove and query contact
// names.
// You will want to create a separate class for Contacts(name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options: Quit, print list of contacts, add new contact, update existing contact,
// remove contact and search/find contact.
// When adding or updating be sure to check if the contact already exists(use name)

package com.akshaw;

import java.util.Scanner;

public class Main {

    private static Scanner sc=new Scanner(System.in);

    static MobilePhone ob=new MobilePhone();

    public static void main(String[] args) {

        boolean run=true;

        while(run){

            System.out.println("\npress 0 to quit");
            System.out.println("press 1 to print list of contacts");
            System.out.println("press 2 to add new contact");
            System.out.println("press 3 to update existing contact");
            System.out.println("press 4 to remove existing contact");
            System.out.println("press 5 to search a given contact by name");
            System.out.println("press 6 to search a given contact by number");

            System.out.print("\nchoice : ");
            int c=sc.nextInt();
            sc.nextLine();

            switch (c){

                case 0:
                    run=false;
                    break;

                case 1:
                    printContactList();
                    break;

                case 2:
                    addContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    searchByName();
                    break;

                case 6:
                    searchByNumber();
                    break;

                default:
                    System.out.println("Wrong choice!! try again!!");
            }
        }
    }

    private static void searchByNumber() {
        System.out.print("enter number : ");
        long num=sc.nextLong();
        ob.searchByNumber(num);
    }

    private static void searchByName() {
        System.out.print("enter name : ");
        String name=sc.nextLine();
        ob.searchByName(name);
    }

    private static void removeContact() {
        System.out.print("enter name : ");
        String name=sc.nextLine();
        ob.removeContact(name);
    }

    private static void updateContact() {
        System.out.print("enter name : ");
        String name=sc.nextLine();
        ob.updateContact(name);
    }

    private static void addContact() {
        System.out.print("enter name : ");
        String name=sc.nextLine();
        System.out.print("enter number : ");
        long num=sc.nextLong();
        ob.addContact(name,num);
    }

    private static void printContactList() {
        ob.printContactList();
    }

}