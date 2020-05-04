import java.util.*;

class Person {

	String name;
	int birthYear;

	Person(String name, int birthYear) {

		this.name = name;
		this.birthYear = birthYear;

	}

	@Override
	public String toString() {
		return "name = "+this.name+"\nbirthYear = "+this.birthYear;
	}
}

class Student extends Person {

	String department;
	double attendancePercentage;

	Student(String name, int birthYear, String department, double attendancePercentage) {

		super(name, birthYear);
		this.department = department;
		this.attendancePercentage = attendancePercentage;

	}

	@Override
	public String toString() {
		return "Name : "+this.name+"\nBirthYear : "+this.birthYear
				+"\nDepartment : "+this.department
				+"\nEligible : "+this.isEligibleForExam();
	}

	public String isEligibleForExam() {

		if(this.attendancePercentage>=75)
			return "Yes";

		return "No";
	}
}

class Staff extends Person {

	double salary;

	Staff(String name, int birthYear, double salary) {

		super(name, birthYear);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "name = "+this.name+"\nbirthYear = "+this.birthYear
				+"\nsalary = "+this.salary;
	}
}

class TeachingStaff extends Staff {

	String subject;
	double resultPercentage;

	TeachingStaff(String name, int birthYear, double salary, String subject, double resultPercentage) {

		super(name, birthYear, salary);
		this.subject = subject;
		this.resultPercentage = resultPercentage;

	}

	@Override
	public String toString() {
		return "Name : "+this.name+"\nBirthYear : "+this.birthYear
				+"\nOld Salary : "+this.salary+"\nSubject : "+this.subject+"\nNew Salary : "+this.calculateNewSalary();
	}

	double calculateNewSalary() {

		if(this.resultPercentage>=87){

			double newSalary = this.salary + this.salary*8.7/100;
			return newSalary;
		}

		return this.salary;

	}
}

class NonTeachingStaff extends Staff {

	String lab;
	double experience;

	NonTeachingStaff(String name, int birthYear, double salary, String lab, double experience) {

		super(name, birthYear, salary);
		this.lab = lab;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Name : "+this.name+"\nBirthYear : "+this.birthYear
				+"\nOld Salary : "+this.salary+"\nLab : "+this.lab+"\nNew Salary : "+this.calculateNewSalary();
	}

	double calculateNewSalary() {

		if(this.experience>=2) {
			double newSalary = this.salary + this.salary*2/100.0;
			return newSalary;
		}

		return this.salary;
	}
}

class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		sc.nextLine();

		String name = sc.nextLine();

		int birthYear = sc.nextInt();

		sc.nextLine();

		switch (n) {
			
			case 1:{

				String department = sc.nextLine();
				double attendancePercentage = sc.nextDouble();

				Student student = new Student(name, birthYear, department, attendancePercentage);

				System.out.println(student.toString());

				break;
			}

			case 2:{

				String subject = sc.nextLine();
				double resultPercentage = sc.nextDouble();
				double salary = sc.nextDouble();

				TeachingStaff teachingStaff = new TeachingStaff(name, birthYear, salary, subject, resultPercentage);

				System.out.println(teachingStaff.toString());

				break;
			}

			case 3:{

				String lab = sc.nextLine();
				double experience = sc.nextDouble();
				double salary = sc.nextDouble();

				NonTeachingStaff nonTeachingStaff = new NonTeachingStaff(name, birthYear, salary, lab, experience);

				System.out.println(nonTeachingStaff.toString());

				break;
			}
		}
	}
}