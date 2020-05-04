'''
n=5
hl=2

* - - - * - - - * 
 * - - * * - - *
  * - *   * - *
   * *     * *
    *       *
   * *     * * 
  * - *   * - *
 * - - * * - - *  
* - - - * - - - *
'''
'''
n=5
hl=3

* - - - * - - - * - - - * 
 * - - * * - - * * - - *
  * - *   * - *   * - *
   * *     * *     * *
    *       *       *
   * *     * *     * * 
  * - *   * - *   * - *
 * - - * * - - * * - - *  
* - - - * - - - * - - - *
'''

n=int(input('size :'))
hl=int(input('horizontal levels :'))
s1=0
s2=n-2
s3=-1
for i in range (n-1):
    for j in range(hl):
        if(j>0):
            print(s3*' ',end='')
        print(s1*' ',end='* ')
        print(s2*'- ',end='')
        if(i>0):
            print(end='*')
        if(i==0):
            if(j==hl-1):
                print(end='*')
    print()
    s1=s1+1
    s2=s2-1
    s3=s3+1

s1=n-1
s2=-1
s3=n-2
for i in range (n):
    for j in range(hl):
        s4=s3
        if(i==0):
            s4=s4-1
        if(j>0):
            print(s4*' ',end='')
        print(s1*" ",end="")
        print(end="* ")
        print(s2*"- ",end="")
        if(i>0):
            if(i<n-1):
                print("*",end="")
        if(i==n-1):
            if(j==hl-1):
                print("*",end="")
    print()
    s1=s1-1
    s2=s2+1
    s3=s3-1
    
    