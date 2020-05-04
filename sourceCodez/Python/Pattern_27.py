'''
n=5

*       * 
 *     *
  *   *
   * *
    *
   * * 
  *   * 
 *     * 
*       * 
'''

n=int(input('size :'))
s1=0
s2=2*(n-2)
for i in range (n-1):
    print(s1*' ',end='* ')
    print(s2*' ',end='*')
    print()
    s1=s1+1
    s2=s2-2
s1=n-1
s2=-2
for i in range (n):
    print(s1*" ",end="")
    print(end="* ")
    print(s2*" ",end="")
    if(i>0):
        print("*",end="")
    print()
    s1=s1-1
    s2=s2+2