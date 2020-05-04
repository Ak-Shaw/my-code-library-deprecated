/*
Generate and display the first 10 terms of the Tribonacci series 
0,1,2,3,6,11,20,37….
                                        
*/
public class Tribonacci
{
public static void main(int n)
{
int a=0,b=1,c=2,d;
System.out.print(a+" "+b+" "+c);
for(int p=4; p<=10; p++)
{
d=a+b+c;
System.out.print(" "+d);
a=b;
b=c;
c=d;
}//for ends
System.out.println();
}
}