//queue using array


#include<stdio.h>
#define MAX 10

int queue[MAX];
int n=11;

void createQueue()
{
    while(n>10)
    {
        printf("\n\nquantity :");
        scanf("%d",&n);
    }
    printf("\nenter %d elements :\n\n",n);
    for(int i=0;i<n;i++)
        scanf("%d",&queue[i]);
}

void enqueue(int e)
{
    if(n==10)
        printf("\n\nqueue is full");
    else
    {
        queue[n++]=e;
        printf("\n\nenqueue operation successful");
    }
}

void dequeue()
{
    if(n==0)
        printf("\n\nqueue is empty");
    else
    {
        int i;
        int k=queue[0];
        for(i=0;i<n-1;i++)
            queue[i]=queue[i+1];
        n--;
        printf("%d element dequeued",k);
    }
}

void printQueue()
{
    printf("\n\nqueue elements are as follows :\n\n");
    for(int i=0;i<n;i++)
        printf("%d\t",queue[i]);
}
int main()
{
    int c=1,e;
    while(c!=0)
    {
        printf("\n\nenter 1 to create queue\n");
        printf("enter 2 to perform ENQUEUE operation\n");
        printf("enter 3 to perform DEQUEUE operation\n");
        printf("enter 4 to print queue elements\n");
        printf("enter 0 to exit\n");
        printf("\nchoice :");
        scanf("%d",&c);
        switch(c)
        {
        case 1:
            createQueue();
            break;
        case 2:
            printf("\n\nenter element to be enqueued :");
            scanf("%d",&e);
            enqueue(e);
            break;
        case 3:
            dequeue();
            break;
        case 4:
            printQueue();
            break;
        case 0:
            printf("program terminated");
            break;
        default:
            printf("\n\ninvalid option");
        }
    }
}
