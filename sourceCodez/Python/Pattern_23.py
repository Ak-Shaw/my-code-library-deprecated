'''
* * * * *
 *     *
  *   *
   * *
    *
'''

n=int(input('size :'))
s1=0
s2=2*(n-2)
for i in range (n):
    print(s1*' ',end='* ')
    if(i==0):
        print((n-1)*'* ',end='')
    elif(i<n-1):
        print(s2*' ',end='*')
    print()
    s1=s1+1
    s2=s2-2