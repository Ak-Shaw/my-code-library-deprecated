/*
 * An anagram is a type of word play, the result of rearranging the letters of 
 * a word or phrase to produce a new word or phrase, using all the original 
 * letters exactly once. 
 */
import java.io.*;
public class Anagram
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Subject Of Anagram :");
String s=br.readLine().toUpperCase(),s2="";
int i,j=0,k,m,q=0,l=s.length(),n=l*3,l1=0;
String c[]=new String[l*l*l*l*l];
int a[]=new int[l];
int b[]=new int[l*3];
System.out.println("Anagramic Arrangements :");
for(k=0;k<l*l*l*l*l;k++)
{
for(i=0;i<l*3;i++)
{
m=(int)(Math.random()*l);
b[i]=m;
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(b[i]==b[j])
b[j]=n;
}
}
j=0;
for(i=0;i<n;i++)
{
if(b[i]!=n)
s2+=s.charAt(b[i]);
}
if(s2.length()==l)
{
c[q]=s2;
q++;
}
s2="";
}
for(i=0;i<q;i++)
{
for(j=i+1;j<q;j++)
{
if(c[i].equals(c[j]))
c[j]="";
}
}
j=0;
for(i=0;i<q;i++)
{
if(c[i]!="")
{
System.out.print(c[i]+" ");
j++;
}
if(j%14==0)
{
System.out.println();
j+=1;
}
}
System.out.println();
}
}