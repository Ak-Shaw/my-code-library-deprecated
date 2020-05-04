#find sum of all factors of a given number

n=int(input("enter a number :"))
s=0
for i in range(1,n+1):
    if(n%i==0):
        s=s+i
print("sum of factors =",s)

