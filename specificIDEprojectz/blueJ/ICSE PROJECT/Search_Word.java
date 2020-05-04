// WAP to search any given word from a given sentence using function
import java.io.*;
public class Search_Word
{
String s,sn,t="";
int l,i,j=0,k=0;
char ch;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a Sentence :");
s=br.readLine();
System.out.print("Word to be searched :");
sn=br.readLine();
}
void search()
{
s+=" ";
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch==' ')
{
if(t.equalsIgnoreCase(sn)==true)
{
k=1;
break; 
}
t="";
j++;
}
else
t+=ch;
}
}
void display()
{
String d="";;
j+=1;
if(j==1)
d="st";
else if(j==2)
d="nd";
else if(j==3)
d="rd";
else
d="th";
if(k==1)
System.out.println("Search successful and the word is found at "+j+d+" position");
else
System.out.println("Search unsuccessful");
}
public static void main(String args[])throws IOException
{
Search_Word ob=new Search_Word();
ob.input();
ob.search();
ob.display();
}
}

