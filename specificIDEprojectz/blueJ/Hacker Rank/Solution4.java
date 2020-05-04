// rectangle area
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {
 private static int B = 0;
    private static int H = 0;
    static boolean flag=true;
    
    static{
           Scanner sc=new Scanner(System.in);
           System.out.println("Input:\n\n");
           B=sc.nextInt();
           sc.nextLine();
           H=sc.nextInt();
           if(B<=0||H<=0)
           {
           flag=false;
           System.out.println("java.lang.Exception: Breadth and height must be positive");   
        }
    }

public static void main(String[] args){
if(flag){
int area=B*H;
System.out.print(area);
}
}
}