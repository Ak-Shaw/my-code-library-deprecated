// stack using array

#include<stdio.h>
#define MAX 10

int stack[MAX];
int n=11;

void createStack()
{
    while(n>10)
    {
        printf("\n\nquantity :");
        scanf("%d",&n);
    }
    printf("\nenter %d elements :\n\n",n);
    for(int i=0;i<n;i++)
        scanf("%d",&stack[i]);
}

void push(int e)
{
    if(n==10)
        printf("\n\nstack overflow");
    else
    {
        stack[n++]=e;
        printf("\n\nelement pushed");
    }
}

void pop()
{
    if(n==0)
        printf("\n\nstack underflow");
    else
    {
        n--;
        printf("\n\nelement popped");
    }
}

void printStack()
{
    printf("\n\nstack elements are as follows :\n\n");
    for(int i=n-1;i>=0;i--)
        printf("%d\n",stack[i]);
}
int main()
{
    int c=1,e;
    while(c!=0)
    {
        printf("\n\nenter 1 to create stack\n");
        printf("enter 2 to perform PUSH operation\n");
        printf("enter 3 to perform POP operation\n");
        printf("enter 4 to print stack elements\n");
        printf("enter 0 to exit\n");
        printf("\nchoice :");
        scanf("%d",&c);
        switch(c)
        {
        case 1:
            createStack();
            break;
        case 2:
            printf("\n\nenter element to be pushed :");
            scanf("%d",&e);
            push(e);
            break;
        case 3:
            pop();
            break;
        case 4:
            printStack();
            break;
        case 0:
            printf("program terminated");
            break;
        default:
            printf("\n\ninvalid option");
        }
    }
}
