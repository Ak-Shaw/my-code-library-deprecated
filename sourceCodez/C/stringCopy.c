#include<stdio.h>

void stringcopy(char *x,char *y)
{
    while(*y!='\0')
        *x++=*y++;
    *x='\0';
}

main()
{
    printf("enter a string :\n\n");
    char s[20],t[20];
    gets(s);
    stringcopy(t,s);
    puts(t);
}
