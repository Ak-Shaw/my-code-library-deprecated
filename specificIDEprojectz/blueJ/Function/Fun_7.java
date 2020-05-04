// Pure function with parameters with calling to add two numbers
// Pass by value
public class Fun_7
{
public int add(int a,int b)
{
int c=a+b;
return c;
}
public static void main(String args[])
{
Fun_7 ob=new Fun_7();// Object Creation
System.out.println("Sum ="+ob.add(15,12));// Calling
}
}