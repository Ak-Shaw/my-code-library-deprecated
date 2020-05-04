/*
Generate and display the first 10 terms of the Fibonacci series 
0,1,1,2,3,5,….
                                         [ICSE 2012]
*/
public class Fibonacci
{
public static void main()
{
int a=0,b=1,c;
System.out.print(a+" "+b);
for(int p=3; p<=10; p++)
{
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}//for ends
}
}