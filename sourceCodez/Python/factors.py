#display factors of a given number

n=int(input("enter a number :"))
print("factors are as follows :")
for i in range(1,n+1):
    if(n%i==0):
        print(i)
