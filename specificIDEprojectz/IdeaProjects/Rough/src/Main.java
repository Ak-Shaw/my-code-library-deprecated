import java.util.*;

public class Main{

    private static Scanner sc=new Scanner(System.in);
    private static ArrayList<Contact> contacts=new ArrayList<Contact>();

    public static void main(String[] args) {

        Contact c1=new Contact("Ayush",9831284491l);

        contacts.add(c1);

        contacts.add(new Contact("Arpana",7980341540l));

        System.out.println("values of c1 :\n"+
                            "name : "+contacts.get(0).getName()+"\n"+
                            "number : "+contacts.get(0).getPhoneNumber()+"\n");

        System.out.println("values of c2 :\n"+
                            "name : "+contacts.get(1).getName()+"\n"+
                            "number : "+contacts.get(1).getPhoneNumber()+"\n");

        System.out.println("size of our arraylist is "+contacts.size());
    }
}