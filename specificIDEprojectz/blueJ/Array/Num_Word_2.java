/* WAP to accept any number from 0-999999 and display it in words. 
 * Also provide the user the choice for International Method or Indian
 * Method.
 * 
 * Sample Input  ---> 456780
 * Sample Output ---> Press 1 for International Method
 *                    Press 2 for Indian Method
 *                    Enter Your Choice :1
 *                    Four Hundred Fifty Six Thousand Seven Hundred Eighty
 *
 * Sample Input  ---> Time
 * Sample Output ---> Unidentified combination of characters
 *                    Sorry! We are unable to produce the result as it is invalid!
 *                    Please Try Again
 *                    
 * Sample Input  ---> 1234678
 * Sample Output ---> Sorry!Data Not Present!
 *                    Since the entered value is out of bounds!
 *                    Please Try Again
 */
import java.io.*;
public class Num_Word_2
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n=0,len,m,z=0,x=0,y,e,f=0,t=0,h=0,u=0,w,v=0,j=0,q,r=0;
char ch;
String Num,str;
System.out.print("Enter any number from 0-999999:");
Num=br.readLine();
String a[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
String b[]={"Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
String c[]={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
String d[]={"Hundred","Thousand","Lakh"};
for(q=0;q<Num.length();q++)
{
ch=Num.charAt(q);
h=(int)ch;
if(h<48||h>57)
{
System.out.println("Unidentified combination of characters");
System.out.println("Sorry! We are unable to produce the result as it is invalid!");
System.out.println("Please Try Again");
r=1;
break;
}
}
if(r==0)
{
n=Integer.parseInt(Num);
v=n;
if(n>999999||n<0)
{
System.out.println("Sorry!Data Not Present!");
System.out.println("Since the entered value is out of bounds!");
System.out.println("Please Try Again");
u=1;
}
}
if(u==0&&v>99999)
{
System.out.println("Press 1 for International Method");
System.out.println("Press 2 for Indian Method");
System.out.print("Enter Your Choice :");
m=Integer.parseInt(br.readLine());
switch(m)
{
case 1:
z=0;
break;
case 2:
z=2;
break;
default:
System.out.println("Sorry! Wrong Choice!");
System.out.println("Please Try Again");
z=3;
}
}
if(u==0&&z!=3)
{
str=Integer.toString(n);
len=str.length();
if(len==6)
{
y=n/100000;
System.out.print(a[y]+" "+d[z]+" ");
n=n%100000;
len-=1;
}
if(len==5)
{
y=n/1000;
if(y>=11&&y<=19)
{
System.out.print(c[y-11]+" "+d[1]+" ");
f=1;
}
if(y%10==0)
{
y=y/10;
e=y%10;
System.out.print(b[y-1]+" "+d[1]+" ");
f=1;
}
if(y>20&&y%10!=0)
{
w=y/10;
e=y%10;
System.out.print(b[w-1]+" "+a[e]+" "+d[1]+" ");
f=1;
}
n=n%10000;
len-=1;
}
if(len==4)
{
if(f==0)
{
y=n/1000;
if(y>0)
System.out.print(a[y]+" "+d[1]+" ");
}
n=n%1000;
len-=1;
}
if(len==3)
{
y=n/100;
if(y>0)
System.out.print(a[y]+" "+d[0]+" ");
n=n%100;
len-=1;
}
if(len==2)
{
if(n>=11&&n<=19)
{
System.out.println(c[n-11]);
t=1;
}
if(n%10==0)
{
System.out.println(b[(n/10)-1]);
t=1;
}
if(n>20&&n%10!=0)
{
y=n/10;
e=n%10;
System.out.println(b[y-1]+" "+a[e]);
t=1;
}
len-=1;
}
if(len==1)
{
if(t==0&&n>0)
{
j=1;
System.out.println(a[n]);
}
if(v<10&&j==0&&r==0)
System.out.println(a[v]);
}
}
}
}

