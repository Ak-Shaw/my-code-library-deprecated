#include<stdio.h>
#include<math.h>
#define MAX_SIZE 101
#define SWAP(x,y,t) ((t)=(x),(x)=(y),(y)=(t))
#define COMPARE(x,y) (((x)<(y))?-1:((x)==(y))?0:1)

void sort(int [],int); //selection sort
int binsearch(int [],int ,int ,int );
void main(void)
{
    int i,n;
    int list[MAX_SIZE];
    printf("Enter the number of numbers to generate : ");
    scanf("%d",&n);
    //int list[n];
    if(n<1||n>MAX_SIZE){
        fprintf(stderr,"Improper value of n\n");
        //exit(EXIT_FAILURE);
    }
    for(i=0;i<n;i++){//randomly generate numbers
        list[i]=rand()%1000;
        printf("%d ",list[i]);
    }
    sort(list,n);
    printf("\n Sorted array:\n");
    for(i=0;i<n;i++)//print out sorted numbers
        printf("%d ",list[i]);
    printf("\n");
    printf("enter search element :");
    int s;
    scanf("%d",&s);
    int p;
    p=binsearch(list,s,0,n-1)+1;
    printf("found at position %d",p);
}
void sort(int list[],int n)
{
    int i,j,min,temp;
    for(i=0;i<n-1;i++){
        min=i;
        for(j=i+1;j<n;j++)
            if(list[j]<list[min])
            min=j;
        SWAP(list[i],list[min],temp);
    }
}

int binsearch(int list[],int searchnum,int left,int right)
{
    /** search list[0] <= list[1] <= ... <= list[n-1] for searchnum.
        Return its position if found. Otherwise return -1 */
        int middle;
        if(left<=right){
            middle=(left+right)/2;
            switch(COMPARE(list[middle],searchnum)){
            case -1: return binsearch(list,searchnum,middle+1,right);
            case 0: return middle;
            case 1: return binsearch(list,searchnum,left,middle-1);
            }
        }
        return -1;
}
