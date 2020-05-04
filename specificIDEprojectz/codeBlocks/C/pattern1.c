/**
    1
  2 3 2
3 4 5 4 3       */
#include <stdio.h>
int main()
{
    int i,j,q=0,w,e=4;
    for(i=1;i<4;i++)
    {
        w=i;
        for(j=0;j<e;j++)
            printf(" ");
        e-=2;
        for(j=0;j<i;j++,w++)
            printf("%d ",w);
            w-=2;
            for(j=0;j<i-1;j++,w--)
                printf("%d ",w);
            printf("\n");
    }
}
