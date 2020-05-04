// Pure function without parameters with calling to add two numbers
public class Fun_5
{
public int add()
{
int a=15,b=12;
int c=a+b;
return(c);
}
public static void main(String args[])
{
Fun_5 ob=new Fun_5();// Object Creation
System.out.println("Sum ="+ob.add());// Calling
}
}