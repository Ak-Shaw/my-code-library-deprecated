/*
Problem Statement
Create a Java application which generates a menu for the user to choose from the
following options:
Choice 1: To generate and display the prime factors of 20 input numbers.
Choice 2: To check and display the palindrome words for 20 input words.
Choice 3: Exit
Program Listing
import java.io.*;
*/
import java.io.*;
public class Pri_Pal
{
void primeFactors(int num)
{ for(int i=1; i<=num; i++)
{ if(num%i==0)//check if i is a factor or not
{ //now check if i is prime or not
int count=0;
for(int j=1; j<=i; j++)
{ if( i%j==0 )//to count number of factors
{ count++;
}
}
if(count==2)
{ System.out.println( "Prime Factor = "+i );
}
}
}
}//primeFactors
void palindrome(String word)
{ String reverse="";
for(int i=word.length()-1; i>=0; i--)//read the string in reverse
{ char c=word.charAt(i);
reverse=reverse+c;
}
if(word.equalsIgnoreCase(reverse))
System.out.println("Palindrome");
else
System.out.println("Not a Palindrome");
}//palindrome
public static void main(String args[])throws IOException
{ BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Pri_Pal obj=new Pri_Pal();
int choice=0;
while(choice!=3)//option 3 is to exit
{ System.out.println("1. Display prime factors of 20 input numbers");
System.out.println("2. Display palindrome words of 20 input words");
System.out.println("3. Exit");
System.out.println("Enter your choice");
choice=Integer.parseInt(br.readLine());
switch(choice)
{ case 1: for(int i=1; i<=2; i++)//for 20 numbes
{ System.out.println("Enter a number");
int num=Integer.parseInt(br.readLine());
obj.primeFactors(num);
}
break;
case 2: for(int i=1; i<=2; i++)//for 20 numbes
{ System.out.println("Enter a word");
String word=br.readLine();
obj.palindrome(word);
}
case 3: break;
default: System.out.println("Wrong choice");
}//switch
}//while
System.out.println("Thanks for using the program");
}//main
}//class
/*
Glossary
Variable Type Use
num int To store the number to be checked
count int For Counting the factors of the
number
word String To store the word to be checked
reverse String To store the reverse of the word
c char To store a character from the word
obj Project(Class) To call the functions
num int To store the number to be checked
count int For Counting the factors of the
number
word String To store the word to be checked
reverse String To store the reverse of the word
c char To store a character from the word
obj Project(Class) To call the functions
Function Type Use
primeFactors() Accepts a number,
returns nothing(void)
To check prime factors of a
number
palindrome() Accepts a word, returns
nothing(void)
To reverse a string and see
if it is a palindrome or not.
*/
/**
Sample Output (for 2 inputs only)
1. Display prime factors of 20 input numbers
2. Display palindrome words of 20 input words
3. Exit
Enter your choice
1
Enter a number
10
Prime Factor = 2
Prime Factor = 5
Enter a number
100
Prime Factor = 2
Prime Factor = 5

1. Display prime factors of 20 input numbers
2. Display palindrome words of 20 input words
3. Exit
Enter your choice
2
Enter a word
niti
Not a Palindrome
Enter a word
nitin
Palindrome

1. Display prime factors of 20 input numbers
2. Display palindrome words of 20 input words
3. Exit
Enter your choice
3
Thanks for using the program
*/