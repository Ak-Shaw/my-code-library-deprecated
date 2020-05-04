import java.io.*;
public class paragraph
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number of sentences :");
int n=Integer.parseInt(br.readLine()),i,j=0,k,w,q,y=0;
String a[]=new String[50];
String b[]=new String[50];
char c;
if(n>4)
System.out.println("invalid input");
else
{
System.out.println("Enter paragraph:");
String s=br.readLine(),t="";
for(i=0;i<s.length();i++)
{
c=s.charAt(i);
if(c==' '||c==','||c=='?'||c=='.')
{
a[j++]=t;
if(t.length()>0)
y++;
t="";
}
else
t+=c;
}
for(i=0;i<j;i++)
{
for(k=i+1;k<j;k++)
{
if(a[i].equalsIgnoreCase(a[k]))
a[k]="";
}
}
k=0;
for(i=0;i<j;i++)
{
if(a[i]!="")
{
b[k]=a[i];
k++;
}
}
int z[]=new int[k];
for(j=0;j<k;j++)
{
q=0;
for(i=0;i<s.length();i++)
{
c=s.charAt(i);
if(c==' '||c==','||c=='?'||c=='.')
{
if(b[j].equalsIgnoreCase(t))
q++;
t="";
}
else
t+=c;
}
z[j]=q;
}
for(i=0;i<k;i++)
{
for(j=0;j<k-1;j++)
{
if(z[j]>z[j+1])
{
w=z[j];
z[j]=z[j+1];
z[j+1]=w;
t=b[j];
b[j]=b[j+1];
b[j+1]=t;
}
}
}
System.out.println("Total number of words:"+y);
System.out.println("\nWORD\tFREQUENCY");
for(i=0;i<k;i++)
{
System.out.println(b[i]+"\t"+z[i]);
}
}
}
}
/**
 * ALGORITHM
   
   step 1:accept number of sentences
   step 2:if(n>4)
    System.out.println("invalid input");
   step 3:accept paragraph in s
   step 4:store each word in an array a[]
   step 5:delete the duplicate elements of array storing them in b[]
   step 6:count the frequency of the respective elements 
   of array and store them in z[] 
   step 7:sort array z[] in ascending order and and correspondingly sort b[]
   step 8:print the total number of words
   step 9: print the words with their frequencies respectively
 */