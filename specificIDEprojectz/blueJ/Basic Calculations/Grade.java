/* 
 * Name
 * ID
 *        Grade I      Grade II      Grade III      Grade IV
 *  
 * Basic 2000-5000    6000-10000    11000-18000    >19000
 * Da       40%          40%           40%            40%
 * HRA      10%          15%           18%            22%
 * PF        8%           8%            8%             8%
 * 
 * Gross=Basic+Da+HRA
 * 
 * Net=Gross-PF
 *
 */
import java.io.*;
public class Grade
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Number of employees :");
int n=Integer.parseInt(br.readLine()),i;
int g[]=new int[n],d[]=new int[n],b[]=new int[n];
String m[]=new String[n];
double da,hra,pf,gr,nt,f=0.1;
for(i=0;i<n;i++)
{
System.out.print("Name :");
m[i]=br.readLine();
System.out.print("Grade :");
g[i]=Integer.parseInt(br.readLine());
System.out.print("ID :");
d[i]=Integer.parseInt(br.readLine());
System.out.print("Basic :");
b[i]=Integer.parseInt(br.readLine());
System.out.print("\f");
}
System.out.println("\t\tEmployees:");
for(i=0;i<n;i++)
{
System.out.println("\nName :"+m[i]);
System.out.println("Grade :"+g[i]);
System.out.println("ID :"+d[i]);
System.out.println("Basic :Rs. "+b[i]);
da=b[i]*0.4;
if(g[i]==2)
f=0.15;
if(g[i]==3)
f=0.18;
if(g[i]==4)
f=0.22;
hra=b[i]*f;
pf=b[i]*0.08;
gr=b[i]+da+hra;
nt=gr-pf;
System.out.println("Gross : Rs."+gr);
System.out.println("Net : Rs."+nt);
}
}
}