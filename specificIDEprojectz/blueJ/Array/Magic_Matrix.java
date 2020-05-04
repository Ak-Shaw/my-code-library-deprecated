/*
 * A square matrix is said to be a Magic Square, if the sum 
 * of each row, each column and each diagonal is same. 
 * Write a program to enter an integer number ‘n’. Create 
 * a magic square of size ‘n*n’. Finally, print the elements 
 * of the matrix as Magic Square.
 */
import java.io.*;
class Magic_Matrix
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\n\nEnter the size of the matrix : ");
            int n=Integer.parseInt(br.readLine());
 
            if(n>5)
             System.out.println("Enter a number between 1 to 5 ");
 
            else
            {
            int A[][]=new int[n][n]; // Creating the Magic Matrix
            int i,j,k,t;
             
            /*Initializing every cell of the matrix with 0 */
            for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                        {
                            A[i][j] = 0;
                        }
                }
 
            /* When the size of the matrix is Odd */
            if(n%2!=0)
            {
                i=0; 
                j = n/2;
                k = 1;
                while(k<=n*n)
                {
                    A[i][j] = k++;
                    i--; // Making one step upward
                    j++; // Moving one step to the right
 
                    if(i<0 && j>n-1) // Condition for the top-right corner element
                    {
                        i = i+2;
                        j--;
                    }
 
                    if(i<0) // Wrapping around the row if it goes out of boundary
                        i = n-1;
 
                    if(j>n-1) // Wrapping around the column if it goes out of boundary
                        j = 0;
 
                    if(A[i][j]>0) // Condition when the cell is already filled
                    {
                        i = i+2;
                        j--;
                    }
                }
            }
             
            /* When the size of the matrix is even */
            else
            {
                k = 1;
                 
                /* Filling the matrix with natural numbers from 1 till n*n */
                for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                        {
                            A[i][j] = k++;
                        }
                }
                 
                j = n-1;
                 
                for(i=0; i<n/2; i++)
                {
                    /* swapping corner elements of primary diagonal */
                    t = A[i][i];
                    A[i][i] = A[j][j];
                    A[j][j] = t;
                     
                    /* swapping corner elements of secondary diagonal */
                    t = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = t;
                     
                    j--;
                }
            }
   
            /* Printing the Magic matrix */
            System.out.println("The Magic Matrix of size "+n+"x"+n+" is:");
            for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                        {
                            System.out.print(A[i][j]+ "\t");
                        }
                 System.out.println();
                }
         }
        }
    }