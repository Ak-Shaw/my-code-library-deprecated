/*
 * A square matrix is said to be a Magic Square, if the sum 
 * of each row, each column and each diagonal is same. 
 * Write a program to enter an integer number ‘n’. Create 
 * a magic square of size ‘n*n’. Finally, print the elements 
 * of the matrix as Magic Square.
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
    public void magicFill()
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
        public void magicPrint()
    {
        System.out.print("\n Magic Square Generated :\n\n");
        for(int i=0;i<order;i++)
        {   for(int j=0;j<order;j++)
            {   System.out.print("\t"+M[i][j]);  }
            System.out.println();
        }
    }
        public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Order : "); order=sc.nextInt();
        if(!(order%2==0)){
        MagicSquare obj=new MagicSquare(order);
        obj.magicFill();}
        else System.out.println("The Order must be Odd");
    }
}
    /**
                        VARIABLE DESCRIPTION
         
          Object        Class
          
            sc         Scanner
            obj       MagicSquare
            
      MagicSquare description :
            
          Variable      Datatype        Purpose
          
            order         int       initializing the order of DDA
            M[][]         int       store the matrix elements
            
      main() description :
                  
          Variable      Datatype        Purpose
          
            order         int       accepting order of DDA
            
      magicFill() description :
            
          Variable      Datatype        Purpose
          
             r            int       specific calculations
             c            int       specific calculations
             n            int       initializing array elements
             
      magicPrint() description :
                  
          Variable      Datatype        Purpose
          
             i            int           looping
             j            int           looping
             
      print() description :
                  
          Variable      Datatype        Purpose
          
             i            int           looping
         
     */
    /**
                ALGORITHM
                
         LIMITATIONS : The order of DDA should be odd
                
         main():
         
         step 1 : accept the order
         step 2 : check whether the order is even or odd
         step 3 : if even then print error message
                  if not then create an object obj of class Magic Square passing the value of order 
         step 4 : invoke magicfill() via obj
         step 5 : exit
         
         MagicSquare(int order):
         
         step 1 : initialize the value of order via this operator
         step 2 : create DDA M[][]
         step 3 : exit
         
         magicFill():
         
         step 1 : check whether the order is even or odd
         step 2 : if even then print error message and return
                  if not then initialize 
                  r=0, c=order/2 & n=1
         step 3 : repeat steps 4-6 while(n<=order*order)
         step 4 : initialize M[r][c]=n++;
         step 5 : decrement r and c by 1
         step 6 : perform specific positional calculations 
         
         if(r<0&&c>=0) // FALLING OFF THE TOP
            {   r=order-1;  }
            else if(c<0&&r>=0) // FALLING FROM LEFT SIDE
            {   c=order-1;  }
            else if(c<0&&r<0||M[r][c]>0) // FALLING FROM CORNER OR ELEMENT ALREADY FILLED
            {   r+=2;   c++; } // DOWN TWO AND RIGHT ONE
            
          step 7 : invoke magicPrint()
          step 8 : exit
                    
          magicPrint():
          
          step 1 : initialize i=0
          step 2 : repeat steps 3-7 while(i<n)
          step 3 : initialize j=0
          step 4 : repeat step 5-6 while(j<n)
          step 5 : invoke print(M[i][j],order*order)
          step 6 : increment j by 1
          step 7 : increment i by 1
          step 8 : exit
          
      */
                  