#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
	int data;
	struct node *next;
}nd;

nd *create()
{
	nd *st,*p,*q;
	st=NULL;
	st=(nd*)malloc(sizeof(nd));
	printf("quantity:");
	int n,i;
	scanf("%d",&n);
	q=st;
	printf("enter %d elements :\n\n",n);
	for(i=0;i<n;i++)
	{
		p=(nd*)malloc(sizeof(nd));
		printf("enter data for node %d :",i+1);
		scanf("%d",&p->data);
		q->next=p;
		q=q->next;
	}
	p->next=NULL;
	//q->next=NULL;
	return st;
}
void display(nd *st)
{
	nd *p,*q;
	p=st;
	p=p->next;
	while(p!=NULL)
	{
		printf("\n%d",p->data);
		p=p->next;
	}
}
int main()
{
	nd *start;
	int c;
	while(1)
	{
		printf("\n\nPress 1 to create Linked List\nPress 2 to display Linked List\nChoice :");
		scanf("%d",&c);
		switch(c)
		{
			case 1:
			start=create();
			break;
			case 2:
			display(start);
			break;
			default:
			printf("invalid option");
			goto a;
		}
	}
	a:{}
	return 0;
}
