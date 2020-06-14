#include <stdio.h>

int main()
{
printf("Current File :%s\n", __FILE__ );
printf("Current Date :%s\n", __DATE__ );
printf("Current Time :%s\n", __TIME__ );
printf("Line Number :%d\n", __LINE__ );
return 0;
}

/* Output:
Current File :C:\Users\GfG\Downloads\deleteBST.c
Current Date :Feb 15 2014
Current Time :07:04:25
Line Number :8 */
