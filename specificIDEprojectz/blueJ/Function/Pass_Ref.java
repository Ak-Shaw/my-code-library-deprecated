/*
    WAP to initialize five integer elements in an array and 
    print the elements by passing each value by creating a 
    function named display(), using a Non-void UDF(User 
    Defined Function)
    
    [Pass By Referrence]
 */
public class Pass_Ref
{
public int display(int a[])
{
int i,b=0;
for(i=0;i<a.length;i++)
{
b=a[i];
System.out.println(b);
}
return b;
}
public static void main(String args[])
{
Pass_Ref ob=new Pass_Ref();
int x[]={5,8,4,9,3};
System.out.println(ob.display(x));
}
}