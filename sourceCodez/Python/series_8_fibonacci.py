''' 0 1 1 2 3 5 8 13 21 34 ...'''
#fibonacci series
n=int(input('input a limit :'))
a=0
b=1
if(n>0):
    print(a,end=' ')
if(n>1):
    print(b,end=' ')
for i in range(n-2):
    c=a+b
    print(c,end=' ')
    a=b
    b=c
