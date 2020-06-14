//knapsack(fractional)

#include<stdio.h>

struct knap
{
	float p;
	float w;
	float pw;
};

int main()
{
	printf("quantity :");
	int n;
	scanf("%d",&n);
	struct knap a[n],temp;
	printf("enter the profit and weight of %d objects :\n\n",n);

	for(int i=0;i<n;i++)
	{
		printf("\n\nobject %d:\n",i+1);
		printf("price :");
		scanf("%f",&a[i].p);
		printf("weight :");
		scanf("%f",&a[i].w);
		a[i].pw=a[i].p/a[i].w;
	}

	for(int i=0;i<n-1;i++)
		for(int j=0;j<n-1-i;j++)
			if(a[j].pw<a[j+1].pw)
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}

	printf("\nknapsack capacity :");
	float c;
	scanf("%f",&c);

	int i=0;
	float profit=0;
	while(i<n&&a[i].w<c)
	{
		c-=a[i].w;
		profit+=a[i].p;
		i++;
	}

	if(i<n)
	profit+=a[i].pw*c;

	printf("profit = %f",profit);

	return 0;
}
