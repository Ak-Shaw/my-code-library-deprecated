#include<stdio.h>
int main()
{
	int i,j;
	printf("enter order of matrix 1:\n");
	printf("Rows :");
	int r1;
	scanf("%d",&r1);
	printf("columns :");
	int c1;
	scanf("%d",&c1);
	printf("Enter order of matrix 2:\n");
	printf("Rows :");
	int r2;
	scanf("%d",&r2);
	printf("Columbs :");
	int c2;
	scanf("%d",&c2);
	if(c1!=r2)
		printf("Matrix multiplication not possible");
	else
	{
		printf("enter matrix 1 elements :");
		int a[r1][c1],b[r2][c2],c[r1][c2];
		for(i=0;i<r1;i++)
			for(j=0;j<c1;scanf("%d",&a[i][j]),j++);

		printf("enter matrix 2 elements :");
	for(i=0;i<r2;i++)
		for(j=0;j<c2;scanf("%d",&b[i][j]),j++);

	int k,s;
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c2;j++)
		{
			s=0;
			for(k=0;k<c1;k++)
			{
				s+=a[i][k]*b[k][j];
			}
			c[i][j]=s;
		}
	}
	printf("result of multiplication :\n\n");
	for(i=0;i<r1;printf("\n"),i++)
		for(j=0;j<c2;printf("\t%d",c[i][j]),j++);

	}
}
