#finding largest prime factor of a number

def prime(n):
    c=0
    for i in range(2,n):
        if(n%i==0):
            c+=1
    if(c==0):
        return 1
    else:
        return 0

n=(int)(input('enter a number :'))

for i in range(n,1,-1):
    if(n%i==0):
        if(prime(i)):
            print(i)
            break