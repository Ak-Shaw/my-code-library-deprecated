#include<stdio.h>
#include<stdlib.h>

typedef struct node{
  int data;
  struct node * nxt;
}node;
node * create(int);
void displayL(node*);

int main()
{
    int n;
    node * ST= NULL;
    printf("enter the no.of nodes: ");
    scanf("%d",&n);
     printf("Linked list is: \n");
    ST= create(n);
    displayL(ST);
    return 0;

}
node * create(int n)
{
    node * h=NULL;
    node * t;
    node * p;
    int i;
      for(i=0;i<n;i++)
      {
          t=(node*)malloc(sizeof(node));
          printf("enter the data for node: ");
          scanf("%d",&(t->data));
          t->nxt=NULL;

          if(h==NULL)
          {
              h=t;
              t=NULL;
          }
          else{
                p=h;
            while(p->nxt!=NULL)
            {
                p=p->nxt;
            }
            p->nxt=t;
            t->nxt=NULL;
          }
      }
      return (h);
}

    void displayL(node* head)
    {
    node * p=head;
    while(p!=NULL){
        printf("%d -> ",p->data);
        p=p->nxt;
    }

    }
