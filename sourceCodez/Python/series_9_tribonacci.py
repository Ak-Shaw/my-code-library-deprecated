'''0 1 2 3 6 11 20 37 68 125 ...'''
#tribonacci
n=int(input('input a limit :'))
a=0
b=1
c=2
if(n>0):
    print(a,end=' ')
if(n>1):
    print(b,end=' ')
if(n>2):
    print(c,end=' ')
for i in range(n-3):
    d=a+b+c
    print(d,end=' ')
    a=b
    b=c
    c=d
