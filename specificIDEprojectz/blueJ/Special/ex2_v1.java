//Minimum insertion for palindrome:
import java.util.*;
class ex2_v1
{
public static void main()
{
int i,j,c=0,n,k;
String st1,st;
Scanner sc=new Scanner(System.in);
System.out.println("enter a word");
st1=sc.nextLine();
st=st1.toUpperCase();
n=st.length();
for(i=65;i<=90;i++)
{ k=0;
    for(j=0;j<n;j++)
    {
        if(i==(st.charAt(j)))
         k++;
        }
    if(k%2!=0)
    c++;
}
if(c>0)
c--;
System.out.println("Minimum insertion to make "+st+" palindrome is= "+c);
}
}
