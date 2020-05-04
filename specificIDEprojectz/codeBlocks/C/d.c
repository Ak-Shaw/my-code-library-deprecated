// C program for insertion sort
#include <math.h>
#include <stdio.h>

/* Function to sort an array using insertion sort*/
void insertionSort(int arr[], int n)
{
	int i, key, j;
	for (i = 1; i < n; i++) {
		key = arr[i];
		j = i - 1;

		/* Move elements of arr[0..i-1], that are
		greater than key, to one position ahead
		of their current position */
		while (j >= 0 && arr[j] > key) {
			arr[j + 1] = arr[j];
			j = j - 1;
		}
		arr[j + 1] = key;
	}
}


/* Driver program to test insertion sort */
int main()
{
	int arr[100000];
	int n =100000;
    for(int i=99999,j=0;j<n;arr[j]=i--,j++);
	insertionSort(arr, n);
	printf("insertion sort successful");
	return 0;
}
