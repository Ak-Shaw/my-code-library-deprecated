package com.akshaw;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner sc=new Scanner(System.in);
    private static ArrayList<Contact> contacts=new ArrayList<Contact>();

    public void searchByNumber(long num) {

        for(int i=0;i<contacts.size();i++)
            if(contacts.get(i).getPhoneNumber()==num){

                System.out.println("contact found and is saved under name : "+contacts.get(i).getName());
            }

    }

    public void searchByName(String name) {

        int i=containsName(name);
        if(i<0)
            System.out.println("name absent");
        else
            System.out.println("name found with phone number : "+contacts.get(i).getPhoneNumber());
    }

    public void removeContact(String name) {

        int i=containsName(name);
        if(i<0)
            System.out.println("contact absent");
        else {
            System.out.println(name+" was saved with phone number "+contacts.get(i).getPhoneNumber());
            contacts.remove(i);
            System.out.println("contact removed");
        }
    }

    public void updateContact(String name) {

        int i=containsName(name);
        if(i<0)
            System.out.println("contact absent");
        else{

            while (true){

                System.out.println("\npress 1 to rename");
                System.out.println("press 2 to update phone number");

                System.out.print("choice : ");
                int c=sc.nextInt();
                sc.nextLine();

                switch(c){

                    case 1:
                        System.out.print("enter new name : ");
                        name=sc.nextLine();
                        contacts.get(i).setName(name);
//                        contacts.set(i,new Contact(name,contacts.get(i).getPhoneNumber()));
                        break;

                    case 2:
                        System.out.println("enter new phone number : ");
                        long num=sc.nextLong();
                        contacts.get(i).setPhoneNumber(num);
//                        contacts.set(i,new Contact(name,num));
                        break;

                }
                if(c==1||c==2)
                    break;
            }
        }
    }

    public void addContact(String name, long num) {

        if(containsName(name)<0) {

            Contact ob = new Contact(name, num);
            contacts.add(ob);
        } else
            System.out.println("name already taken with phone number : "+contacts.get(containsName(name)).getPhoneNumber());
    }

    public void printContactList() {

        if(contacts.isEmpty())
            System.out.println("contact list empty");
        else{
            for(int i=0;i<contacts.size();i++)
                System.out.println(contacts.get(i).getName()+"\t=>\t"+contacts.get(i).getPhoneNumber());
        }
    }

    private static int containsName(String name){

        for(int i=0;i<contacts.size();i++)
            if(contacts.get(i).getName().equals(name))
                return i;

        return -1;
    }
}
