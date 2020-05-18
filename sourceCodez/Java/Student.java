//a code to initialize and display the data of three students of "Brainware Group of Institutions"

import java.util.*;

public class Student
{
	static String college="Brainware Group of Institutions";
	private int rollNo;
	private String name;
	private int contact;
	private String email;
	static int counter=0;

	void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}

	int getRollNo()
	{
		return rollNo;
	}

	void setName(String name)
	{
		this.name=name;
	}

	String getName()
	{
		return name;
	}

	void setContact(int contact)
	{
		this.contact=contact;
	}

	int getContact()
	{
		return contact;
	}

	void setEmail(String email)
	{
		this.email=email;
	}

	String getEmail()
	{
		return email;
	}

	void input()
	{
		Scanner sc=new Scanner(System.in);
		this.setRollNo(++counter);
		System.out.println("\n\nenter info of student of roll no "+this.getRollNo());
		System.out.print("\nname :");
		this.setName(sc.nextLine());
		System.out.print("contact :");
		this.setContact(sc.nextInt());
		System.out.print("email :");
		this.setEmail(sc.next());	
	}

	void output()
	{
		System.out.println("roll no :"+this.getRollNo());
		System.out.println("name :"+this.getName());
		System.out.println("contact :"+this.getContact());
		System.out.println("email :"+this.getEmail());
		System.out.println();
	}

	public static void main(String[] args) {

		Student stud1=new Student();
		Student stud2=new Student();
		Student stud3=new Student();

		stud1.input();
		stud2.input();
		stud3.input();

		System.out.println("\n\n"+college+"\n\n");

		stud1.output();
		stud2.output();
		stud3.output();
	}
}
