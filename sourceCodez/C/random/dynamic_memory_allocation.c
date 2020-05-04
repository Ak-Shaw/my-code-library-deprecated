/**
In your program your may wish to acquire space in which you will store information. When you write your program you may not know
how much space you will need(for example, the size of an array may depend on input to the program), nor do you wish to allocate
some very large area that may never be required. To solve this problem C provides a mechanism, called a heap, for allocating
storage at run time. Whenever you need a new area of memory, you may call a function, malloc, and request the amount you need.
If the memory is available, a pointer to the start  of an area of memory of the required size is returned. When the requested
memory is not available, the pointer NULL is returned. At a later time when you no longer need an area of memory, you may free
it by calling another function, free, and return the area of memory to the system. Once an area of memory is freed, it is
improper to use it.
                    The call to malloc includes a parameter that determines the size of storage required to hold the int or the
float. The result is a pointer to the first byte of a storage area of the proper size. The type of the result can vary. On some
systems the result of malloc is a char *, a pointer to a char. However, those who use ANSI C will find that the result is void *.
The notation (int *) and (float *) are type cast expressions, which may be omitted in the code below. They transform the resulting
pointer into a pointer to the correct type. The pointer is then assigned to the proper pointer variable. The free function
deallocates an area of memory previously allocated by malloc. In some versions of C, free expects an argument that is a char *,
while ANSI C expects void *. However, the casting of the argument is generally omitted in the call to free.

    int i, *pi;
    float f, *pf;
    pi=(int *)malloc(sizeof(int));
    pf=(float *)malloc(sizeof(float));
    *pi=1024;
    *pf=3.14;
    printf("an integer = %d, a float = %f\n",*pi,*pf);
    free(pi);
    free(pf);

Now if we insert  the line:

                                pf=(float *)malloc(sizeof(float));

immediately after the print statement, then the pointer to the storage used to hold the value 3.14 has disappeared. Now there is
no way to retrieve this storage. This is an example of a dangling reference. Whenever all pointers to a dynamically allocated area
of storage are lost, the storage is lost to the program. As we examine programs that make use of pointers and dynamic storage,
we will make it a point to always return storage after we no longer need it.

*/
