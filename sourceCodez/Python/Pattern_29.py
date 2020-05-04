'''
n=5
l=2

* - - - * 
 * - - *
  * - *
   * *
    * 
   * * 
  * - * 
 * - - * 
* - - - * 
 * - - *
  * - *
   * *
    * 
   * * 
  * - * 
 * - - * 
* - - - *
'''

'''
n=5
l=3

* - - - * 
 * - - *
  * - *
   * *
    * 
   * * 
  * - * 
 * - - * 
* - - - * 
 * - - *
  * - *
   * *
    * 
   * * 
  * - * 
 * - - * 
* - - - * 
 * - - *
  * - *
   * *
    * 
   * * 
  * - * 
 * - - * 
* - - - *
'''

n=int(input('size :'))
l=int(input('levels :'))

if(l>0):
    s1=0
    s2=n-2
    print(s1*' ',end='* ')
    print(s2*'- ',end='*')
    print()
  
for i in range(l):
    s1=1
    s2=n-3
    for i in range (n-2):
        print(s1*' ',end='* ')
        print(s2*'- ',end='*')
        print()
        s1=s1+1
        s2=s2-1
    s1=n-1
    s2=-1
    for i in range (n):
        print(s1*" ",end="")
        print(end="* ")
        print(s2*"- ",end="")
        if(i>0):
            print("*",end="")
        print()
        s1=s1-1
        s2=s2+1