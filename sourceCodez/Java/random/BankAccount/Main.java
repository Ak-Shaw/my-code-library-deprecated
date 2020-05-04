/*

Write classes to hold Account, SB-Account and Current-Account details. 
[Here implements the concept of inheritance]. The common properties of 
the account are Account number, name and amount. Specifics of SB account 
is 4% interest to be paid per month. 

->	Implement the run-time polymorphism by creating base class variable 
	and derived class object. 
->	Ask the user for which type of account to be created then create the 
	corresponding account. [Note: Use scanner class]
->	Implement function overriding by having deposit and withdraw 
	funcions and 
-> 	perform the required action accordingly.

Ensure base class can't be instantiated. [Note: Abstract keyword can be used]

Define the minimum balance for both the type of accounts. Use final keyword 
to create constants. Ensure sb account and current account classes cannot 
be used as base classes. [Note: You can use final classes]

*/

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Press 1 to create savings account\n"
			           + "Press 2 create current account\n\n"
			           + "Choice : ");

		int c = sc.nextInt();

		int accno = 0;
		String name = null;
		double balance = 0.0;

		switch (c) {

			case 1:
			case 2:

				System.out.print("\nAccount Number : ");
				accno = sc.nextInt();
				sc.nextLine();
				System.out.print("Name : ");
				name = sc.nextLine();
				System.out.print("Balance : ");
				balance = sc.nextDouble();

				break;

			default:
				
				System.out.println("Invalid Option");
				System.exit(0);
			
		}

		Account account = null;

		switch (c) {

			case 1:

				if (balance < 500) {
					System.out.println("\nInsufficient amount to create savings account");
					System.exit(0);
				}

				account = AccountFactory.getAccount("savings", accno, name, balance);

				break;
			
			case 2:

				if (balance < 1000) {
					System.out.println("\nInsufficient amount to create current account");
					System.exit(0);
				}

				account = AccountFactory.getAccount("current", accno, name, balance);

				break;

		}

		while (true) {

			System.out.print("\n\nPress 1 to deposit\n"
				           + "Press 2 to withdraw\n"
				           + "Press 3 to display details\n"
				           + "Press 4 to exit\n\n"
				           + "Choice : ");

			c = sc.nextInt();

			switch (c) {

				case 1 : {

					System.out.print("\nDeposit Amount : ");
					double amount = sc.nextDouble();
					account.deposit(amount);

					break;
				}

				case 2 : {

					System.out.print("\nWithdraw Amount : ");
					double amount = sc.nextDouble();
					boolean result = account.withdraw(amount);
					if(!result) {
						System.out.println("\nInsufficient balance");
					}

					break;
				}

				case 3 :

					account.display();

					break;

				case 4 :
				default :

					System.exit(0);

				
			}
		}
	}
}