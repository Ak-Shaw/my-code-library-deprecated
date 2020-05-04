/*
 * Given : 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
 * 
 * Process : 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29
 *           1 3 7 9 13 15 19 21 25 27
 *           1 3 7 13 15 19 25 27
 *           1 3 7 13 19 25 27
 *           1 3 7 13 19 27
 *           
 * Output :  1 3 7 13 19 27
 */
//import java.util.*;
public class Lucky
{
public static void main(String args[])
{
//Scanner obj=new Scanner(System.in);
int arr[]=new int[30];
for(int i=0;i<arr.length;i++)
arr[i]=i+1;
boolean b=true;
int ent;
int it=2;int in;
while(b==true)
{
ent=0;
in=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]!=-1)
in++;
if(in==it)
{
arr[i]=-1;
ent++;
in=0;
}
}
if(ent==0)
b=false;
else
it++;
}
System.out.println("The Lucky numbers are :");
for(int i=0;i<arr.length;i++)
{
if(arr[i]!=-1)
System.out.println(arr[i]);
}
}
}