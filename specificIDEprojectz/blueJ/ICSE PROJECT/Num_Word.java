// Accept any number from 0-999 and display it in words
import java.io.*;
public class Num_Word
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter any number from 0-999 :");
int num=Integer.parseInt(br.readLine());
String ones[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eigth","Nine"};
String tens[]={"Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
String teens[]={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
String hundreds[]={"One Hundred","Two Hundred","Three Hundred","Four Hundred","Five Hundred","Six Hundred","Seven Hundred","Eight Hundred","Nine Hundred"};
if(num>=0&&num<=9)
{
System.out.println(num+" is "+ones[num]);
}
else if(num>=11&&num<=19)
{
System.out.println(num+" is "+teens[(num%10)-1]);
}
else if(num%10==0)
{
System.out.println(num+" is "+tens[(num/10)-1]);
}
else if(num>=20&&num<=99)
{
if(num%10!=0)
{
System.out.print(num+" is "+tens[(num/10)-1]);
System.out.println(" "+ones[num%10]);
}
}
else if(num>=100&&num<=999)
{
if(num%100==0)
{
System.out.println(num+" is "+hundreds[(num/100)-1]);
}
else if(num%10==0&&num%100!=0)
{
System.out.print(num+" is "+hundreds[(int)(num/100)-1]);
System.out.println(" "+tens[(num/10)%10-1]);
}
else if((num%100)>=11&&(num%100)<=19)
{
System.out.print(num+" is "+hundreds[(int)(num/100)-1]);
System.out.println(" "+teens[(int)(num/10)%10-1]);
}
else
{
System.out.print(num+" is "+hundreds[(int)(num/100)-1]);
System.out.print(" "+tens[(int)(num/10)%10-1]);
System.out.println(" "+ones[num%10]);
}
}
else
System.out.println(num+" is thousand");
}
}

