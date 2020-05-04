/**
 *  Algorithm 1 :      Algorithm 2 :        Algorithm 3 :      Algorithm 4 :
 *  
 *  15  8  1 24 17     17 24  1  8 15       9  2 25 18 11     11 18 25  2  9
 *  16 14  7  5 23     23  5  7 14 16       3 21 19 12 10     10 12 19 21  3
 *  22 20 13  6  4      4  6 13 20 22      22 20 13  6  4      4  6 13 20 22
 *   3 21 19 12 10     10 12 19 21  3      16 14  7  5 23     23  5  7 14 16
 *   9  2 25 18 11     11 18 25  2  9      15  8  1 24 17     17 24  1  8 15
 *   
 * @author SHANTANU KHAN
 * @mail shantanukhan1995@gmail.com
 * @website 0code.blogspot.com
 * Program Type : BlueJ Program - Java
 */
import java.util.Scanner;
public class MagicSquare
{
    private int[][] M;
    private static int order;
    public MagicSquare(int order)
    {
        this.order=order;
        M=new int[order][order];
    }
    public void magicFill1()
    {
        if(order%2==0)
        {   System.out.println("\nERROR : ORDER MUST BE ODD");    return; }
        int r=0,c=order/2,n=1;
        while(n<=order*order)
        {
            M[r][c]=n++;
            r--; c--; // MOVES TOP LEFT CORNER
            if(r<0&&c>=0) // FALLING OFF THE TOP
            {   r=order-1;  }
            else if(c<0&&r>=0) // FALLING FROM LEFT SIDE
            {   c=order-1;  }
            else if(c<0&&r<0||M[r][c]>0) // FALLING FROM CORNER OR ELEMENT ALREADY FILLED
            {   r+=2;   c++; } // DOWN TWO AND RIGHT ONE
        }
        magicPrint();
    }
    public void magicFill2()
    {
        if(order%2==0)
        {   System.out.println("\nERROR : ORDER MUST BE ODD");    return; }
        int r=0,c=order/2,n=1;
        while(n<=order*order)
        {
            M[r][c]=n++;
            r--; c++; // MOVES TOP RIGHT CORNER
            if(r<0&&c<=order-1) // FALLING OFF THE TOP
            {   r=order-1;  }
            else if(c>order-1&&r>=0) // FALLING FROM RIGHT SIDE
            {   c=0;  }
            else if(c>order-1&&r<0||M[r][c]>0) // FALLING FROM CORNER OR ELEMENT ALREADY FILLED
            {   r+=2;   c--; } // DOWN TWO AND LEFT ONE
        }
        magicPrint();
    }
    public void magicFill3()
    {
        if(order%2==0)
        {   System.out.println("\nERROR : ORDER MUST BE ODD");    return; }
        int r=order-1,c=order/2,n=1;
        while(n<=order*order)
        {
            M[r][c]=n++;
            r++; c--; // MOVES BOTTOM LEFT CORNER
            if(r>order-1&&c>=0) // FALLING OFF THE BOTTOM
            {   r=0;  }
            else if(c<0&&r<=order-1) // FALLING FROM LEFT SIDE
            {   c=order-1;  }
            else if(c<0&&r>=order||M[r][c]>0) // FALLING FROM CORNER OR ELEMENT ALREADY FILLED
            {   r-=2;   c++; } // TOP TWO AND RIGHT ONE
        }
        magicPrint();
    }
    public void magicFill4()
    {
        if(order%2==0)
        {   System.out.println("\nERROR : ORDER MUST BE ODD");    return; }
        int r=order-1,c=order/2,n=1;
        while(n<=order*order)
        {
            M[r][c]=n++;
            r++; c++; // MOVES BOTTOM RIGHT CORNER
            if(r>order-1&&c<=order-1) // FALLING OFF THE BOTTOM
            {   r=0;  }
            else if(c>order-1&&r<=order-1) // FALLING FROM RIGHT SIDE
            {   c=0;  }
            else if(c>order-1&&r>order-1||M[r][c]>0) // FALLING FROM CORNER OR ELEMENT ALREADY FILLED
            {   r-=2;   c--; } // TOP TWO AND RIGHT ONE
        }
        magicPrint();
    }
    public void magicPrint()
    {
        System.out.print(" Magic Square Generated :\n\n");
        for(int i=0;i<order;i++)
        {   for(int j=0;j<order;j++)
            {   print(M[i][j],order*order);  }
            System.out.println();
        }
    }
    private void print(int num,int max) // SPECIAL PRINT WHICH CALCULATES THE SPACES
    {
        String n=new String()+num; String m=new String()+max;
        for(int i=0;i<=(m.length()-n.length());i++) System.out.print(" ");
        System.out.print(n);
    }
    private void clear(){for(int i=0;i<order;i++){for(int j=0;j<order;j++){M[i][j]=0;}}}
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Order : "); order=sc.nextInt();
        if(!(order%2==0)){
        MagicSquare obj=new MagicSquare(order);
        System.out.print("\nAlgorithm 1 : "); obj.magicFill1(); obj.clear();
        System.out.print("\nAlgorithm 2 : "); obj.magicFill2(); obj.clear();
        System.out.print("\nAlgorithm 3 : "); obj.magicFill3(); obj.clear();
        System.out.print("\nAlgorithm 4 : "); obj.magicFill4(); obj.clear();}
        else System.out.println("The Order must be Odd");
    }
}
