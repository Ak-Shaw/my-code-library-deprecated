#perfect number check for a given range

ll=input("lower limit :")
ul=input("upper limit :")
ll=int(ll)
ul=int(ul)

for j in range(ll,ul+1):
    n=j
    s=0
    for i in range(1,n):
        if(n%i==0):
            s=s+i
            if(s==n):
                print(n,"is a perfect number")
