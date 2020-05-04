#Factorial
#5!=5*4*3*2*1
n=int(input("enter a number:"))
f=1
while(n!=0):
    f=f*n
    n=n-1
print('factorial =',f)