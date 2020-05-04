//Recursive Selection Sort

#include <stdio.h>

void swap(int *a,int *b)
{
    int t=*a;
    *a=*b;
    *b=t;
}

void selectionSortRecursive(int a[],int i,int n)
{
    if(i==n-1)
        return;

    int min=i;

    for(int j=i+1;j<n;j++)
        if(a[min]>a[j])
            min=j;

    swap(&a[min],&a[i]);

    selectionSortRecursive(a,i+1,n);
}

void printArray(int arr[], int n)
{
	for (int i=0; i < n; i++)
		printf("%d ",arr[i]);
}


int main()
{
	int arr[] = {12, 11, 13, 5, 6};
	int n = sizeof(arr)/sizeof(arr[0]);

	selectionSortRecursive(arr,0,n);
	printArray(arr, n);

	return 0;
}
