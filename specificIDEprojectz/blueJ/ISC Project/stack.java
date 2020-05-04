//Stack Operation

import java.io.*;
class stack
    {
        int n,top;
        int s[];
        public static void main()throws IOException
        {
            int n1=0,l,ele;
            stack ob=new stack();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 1 to create");
            System.out.println("Enter 2 to insert");
            System.out.println("Enter 3 to delete");
            System.out.println("Enter 4 to display");
            System.out.println("Enter 5 to exit");
            while(n1!=5)
            {
                System.out.println("Enter your choice");
                n1=Integer.parseInt(br.readLine());
                switch(n1)
                {
                    case 1:
                    {
                        System.out.println("enter the limit");
                        l=Integer.parseInt(br.readLine());
                        ob.stck(l);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Enter element :");
                        ele=Integer.parseInt(br.readLine());
                        ob.push(ele);
                        break;
                    }
                    case 3:
                    {
                        ob.pop();
                        break;
                    }
                    case 4:
                    {
                        ob.display();
                        break;
                    }
                    case 5:
                    {
                        ob.display();
                        break;
                    }
                    default:
                    System.out.println("Wrong choice");
                }
            }
        }
        void stck(int nn)
        {
            n=nn;
            top=-1;
            s=new int[n];
        }
        void push(int elm)
        {
            top++;
            if(top>n-1)
            {
                System.out.println("overflow");
                top--;
            }
            else
            {
                s[top]=elm;
            }
        }
        void pop()
        {
            if(top<0)
            System.out.println("underflow");
            else
            {
                int temp=s[top];
                top--;
                System.out.println(temp+" is deleted");
            }
        }
        void display()
        {
            int j;
            if(top<0)
            System.out.println("stack is empty");
            else
            {
                System.out.println("stak elements are :");
                for(j=0;j<=top;j++)
                System.out.print(s[j]+" ");
                System.out.println();
            }
        }
    }
/**
 * ALGORITHM
 * 
 * Algorithm for Push Operation
 * 
 * S is stack with TOP as the stack pointer. A data ELM is to be pushed 
 * into the stack where capacity of the stack is Size
 * 
 * 1. Check for the overflow
 * if(TOP==SIZE)
 * Display "stack overflow");
 * return
 * 2. Increase stack pointer
 * TOP=TOP+1
 * 3. Push element
 * S[TOP]=ELM
 * 4. Return
 * 
 * Algorithm for Pop operation
 * 
 * S is stack with capacity Size
 * 1. Check for underflow
 * if(TOP<0)
 * Display "stack underflow"
 * Return
 * 2. Pop out the element
 * temp=s[TOP]
 * Display"TEMP is deleted"
 * 3. Decrease stack ponter
 * TOP=TOP-1
 * 4. Return
 */