'''
perfect number is a number whose sum of factors excludng the number itself
gives the original number

eg

6=1+2+3
'''

n=input("enter a number :")
n=int(n)
s=0
for i in range(1,n):
    if(n%i==0):
        s=s+i
if(s==n):
    print(n,"is a perfect number")
else:
    print(n,"is not a perfect number") 

