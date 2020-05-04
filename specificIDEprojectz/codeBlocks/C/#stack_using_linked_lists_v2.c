// C program for linked list implementation of stack
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
 
// A structure to represent a stack
struct StackNode
{
    int data;
    struct StackNode* next;
};
 
struct StackNode* newNode(int data)
{
    struct StackNode* stackNode =
              (struct StackNode*) malloc(sizeof(struct StackNode));
    stackNode->data = data;
    stackNode->next = NULL;
    return stackNode;
}
 
int isEmpty(struct StackNode *root)
{
    return !root;
}
 
void push(struct StackNode** root, int data)
{
    struct StackNode* stackNode = newNode(data);
    stackNode->next = *root;
    *root = stackNode;
    printf("%d pushed to stack\n", data);
}
 
int pop(struct StackNode** root)
{
    if (isEmpty(*root))
        return INT_MIN;
    struct StackNode* temp = *root;
    *root = (*root)->next;
    int popped = temp->data;
    free(temp);
 
    return popped;
}
 
int peek(struct StackNode* root)
{
    if (isEmpty(root))
        return INT_MIN;
    return root->data;
}
 
int main()
{
    struct StackNode* root = NULL;
    

    int c=1,e;
    
    while(c)
    {
        printf("\nPress 1 to perform PUSH operation\n");
        printf("\nPress 2 to perform POP operation\n");
        printf("\nPress 3 to display TOP element\n");
        printf("\nchoice :");
        scanf("%d",&c);
        switch(c)
        {
            case 1:
            printf("\nenter element :");
            scanf("%d",&e);
            push(&root, e);
            break;
            case 2:
            printf("\n%d popped from stack\n", pop(&root));
            break;
            case 3:
            printf("\nTop element is %d\n", peek(root));
            break;
            default:
            exit(1);
        }
    }
 
    return 0;
}