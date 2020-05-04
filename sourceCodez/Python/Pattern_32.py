'''


n=5
hl=1


            *
           * *
          *   *
         *     *
* * * * * * * * * * * * *
 *     *         *     *
  *   *           *   *
   * *             * *
    *               *
   * *             * *
  *   *           *   *
 *     *         *     *
* * * * * * * * * * * * *
         *     *
          *   *
           * *
            *
            
            
'''
'''


n=5
hl=2


            *                       *
           * *                     * *
          *   *                   *   *
         *     *                 *     *
* * * * * * * * * * * * * * * * * * * * * * * * *
 *     *         *     * *     *         *     *
  *   *           *   *   *   *           *   *
   * *             * *     * *             * *
    *               *       *               *
   * *             * *     * *             * *
  *   *           *   *   *   *           *   *
 *     *         *     * *     *         *     *
* * * * * * * * * * * * * * * * * * * * * * * * *
         *     *                 *     *
          *   *                   *   *
           * *                     * *
            *                       *
            
            
'''

n=int(input('size :'))
hl=int(input('horizontal levels :'))
s1=3*(n-1)
s2=-1
for i in range(n-1):
    for j in range(hl):
        print(s1*' ',end='*')
        if(i>0):
            print(s2*' ',end='*')
        print((s1-1)*' ',end='')
    print()
    s1=s1-1
    s2=s2+2
#==============================================
e=3*n-3
if(hl>=1):
    print(end='* ')
for j in range(hl):
    print(e*'* ',end='')
print()
#==============================================
s3=1
s4=2*n-5
s5=2*n-1
for i in range(n-1):
    for j in range(hl):
        print(s3*' ',end='*')
        if(i<n-2):
            print(s4*' ',end='*')
        print(s5*' ',end='*')
        if(i<n-2):
            print(s4*' ',end='*')
        print((s3-1)*' ',end='')
    print()
    s3=s3+1
    s4=s4-2
    s5=s5+2
#================================================
s3=n-2
s4=1
s5=4*n-7
for i in range(n-2):
    for j in range(hl):
        print(s3*' ',end='*')
        print(s4*' ',end='*')
        print(s5*' ',end='*')
        print(s4*' ',end='*')
        print((s3-1)*' ',end='')
    print()
    s3=s3-1
    s4=s4+2
    s5=s5-2
#=================================================
e=3*n-3
if(hl>=1):
    print(end='* ')
for j in range(hl):
    print(e*'* ',end='')
print()
#==================================================
s1=2*n-1
s2=2*n-5
for i in range(n-1):
    for j in range(hl):
        print(s1*' ',end='*')
        if(i<n-2):
            print(s2*' ',end='*')
        print((s1-1)*' ',end='')
    print()
    s1=s1+1
    s2=s2-2