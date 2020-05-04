public class String_Func
{
public static void main(String args[])
{
String x="computer";
String y="application";
String b="COMPUTER";
System.out.println(y.length());
System.out.println(x.substring(2,5));
System.out.println(x.indexOf('p'));
System.out.println(y.charAt(6));
System.out.println(y.substring(5)+x);
System.out.println(x.substring(2,4));
System.out.println(y.indexOf(y.charAt(4)));
System.out.println(y.lastIndexOf(y.charAt(4)));
System.out.println(x.equals(b));
System.out.println(x.equalsIgnoreCase(b));
System.out.println(x.concat(y));
System.out.println(x+" "+y);
System.out.println(x+y);
System.out.println(x.compareTo(y));
}
}

