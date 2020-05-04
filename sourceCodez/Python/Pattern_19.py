'''

n=5

*       * * * * *
*       *
*       *
*       *
* * * * * * * * * 
        *       *
        *       *
        *       *
* * * * *       *

'''

n=int(input('size :'))
a=(n-2)*2
b=n-2
c=2*n-1
d=(n-1)*2
#-----------------------------
print(end='* ')
print(a*' ',end='')
print(n*'* ')
#-----------------------------
for i in range(b):
    print(end='* ')
    print(a*' ',end='')
    print('* ')
#-----------------------------
print(c*'* ')
#-----------------------------
for i in range(b):
    print(d*' ',end='')
    print(end='* ')
    print(a*' ',end='')
    print('*')
#-----------------------------
print(n*'* ',end='')
print(a*' ',end='*')