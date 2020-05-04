//linked list

#include <stdio.h>
#include <stdlib.h>

struct Node {
	int data;
	struct Node* next;
};

void printList(struct Node* n)
{
	while (n != NULL) {
		printf(" %d ", n->data);
		n = n->next;
	}
}

struct Node* createLinkedList()
{
    struct Node *st,*p,*q;
    printf("quantity :");
    int n;
    scanf("%d",&n);

    st=NULL;
	st=(struct Node*)malloc(sizeof(struct Node));

	q=st;

	printf("enter %d elements :\n\n",n);
	for(int i=0;i<n;i++)
	{
		p=(struct Node*)malloc(sizeof(struct Node));
		printf("enter data for node %d :",i+1);
		scanf("%d",&p->data);
		q->next=p;
		q=q->next;
	}
	p->next=NULL;
	//q->next=NULL;
	return st->next;
}
int main()
{
    struct Node* head=NULL;
    head=createLinkedList();
    printList(head);
}
