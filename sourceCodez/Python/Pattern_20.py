'''

n=5

                *
              *
            * 
          *
        *               *
          *           *   *
            *       *       *
              *   *           *
*               *               *
  *           *   *
    *       *       *
      *   *           *
        *               *
                      *
                    *
                  *
                *
               
               
'''
'''


================================
               *
             *
           * 
         *
================================
       *               *
         *           *   *
           *       *       *
             *   *           *
================================
*              *               *
================================
 *           *   *
   *       *       *
     *   *           *
       *               *
================================
                     *
                   *
                 *
               *
================================               
              
'''
n=int(input("size :"))
#===============================
s1=4*n-4
for i in range(n-1):
    print(s1*' '+'*')
    s1=s1-2
#===============================
s2=4*n-5
s3=-1
for i in range(n-1):
    print(s1*' ',end='*')
    print(s2*' ',end='*')
    if(i>0):
        print(s3*' ',end='*')
    print()
    s1=s1+2
    s2=s2-4
    s3=s3+4
#===============================
print('*'+s3*' '+'*'+s3*' '+'*')
#===============================
s4=2
s3=s3-4
s5=3
for i in range(n-1):
    print(s4*' ',end='*')
    if(i<n-2):
        print(s3*' ',end='*')
    print(s5*' '+'*')
    s4=s4+2
    s3=s3-4
    s5=s5+4
#=============================
s6=6*n-8
for i in range(n-1):
    print(s6*' '+'*')
    s6=s6-2