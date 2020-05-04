// Queue operation

import java.io.*;
class queue
    {
        int n,front,rear;
        int s[];
        public static void main()throws IOException
        {
            int n1=0,l,ele;
            queue ob=new queue();
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
                        ob.queue(l);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Enter element :");
                        ele=Integer.parseInt(br.readLine());
                        ob.insert(ele);
                        break;
                    }
                    case 3:
                    {
                        ob.delete();
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
        void queue(int nn)
        {
            n=nn;
            front=rear=-1;
            s=new int[n];
        }
        void insert(int elm)
        {
            rear++;
            if(front==-1)
            front=0;
            if(rear>n-1)
            {
                System.out.println("overflow");
                rear--;
            }
            else
            {
                s[rear]=elm;
            }
        }
        void delete()
        {
            if(front>rear)
            System.out.println("underflow");
            else
            {
                int temp=s[front];
                front++;
                System.out.println(temp+" is deleted");
            }
        }
        void display()
        {
            int j;
            if(front-1==rear)
            System.out.println("queue is empty");
            else
            {
                System.out.println("queue elements are :");
                for(j=front;j<=rear;j++)
                System.out.print(s[j]+" ");
                System.out.println();
            }
        }
    }
    
/**
 * ALGORITHM
 * 
 * Algorithm for Insert Operation in a Queue
 * 
 * S is queue with FRONT, REAR as the end pointers. A data ELM is to be inserted
 * into the queue where capacity of the queue is Size
 * 
 * 1. Check for the overflow
 * if(rear==SIZE)
 * Display "queue overflow");
 * return
 * 2. set the rear end pointer
 * if(front==1&&rear<n-1)
 * {front=0;
 * rear=0;
 * }else
 * rear=rear+1
 * 3. insert the element
 * S[rear]=ELM
 * 4. Return
 * 
 * Algorithm for Delete operation
 * 
 * S is queue with capacity Size
 * 1. Check for underflow
 * if(rear==front)
 * Display "queue underflow"
 * Return
 * 2. delete an element
 * temp=s[front]
 * Display"TEMP is deleted"
 * 3. Increase queue ponter
 * front=front+1
 * 4. Return
 */
            
         