void swap(int *x,int *y)
{
    /**both parameters are pointers to ints*/
    int temp=*x;    /** declares temp as an int and assigns
                        to it the contents of what x points to */
    *x=*y;          /** stores what y points to into the location
                        where x points to */
    *y=temp;        /** places the contents of temp in location
                        pointed to by y */
}

/** function call:
                    swap(&a,&b);

                    or

                    swap(a,b);
*/

//macro version
//macro works with any data type

#define SWAP(x,y,t) ((t)=(x),(x)=(y),(y)=(t))

/** function call:
                    SWAP(a,b,t);
*/
