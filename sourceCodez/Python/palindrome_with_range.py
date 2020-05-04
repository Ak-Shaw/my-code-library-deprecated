#palindrome number check for a given range

ll=input("lower limit :")
ul=input("upper limit :")
ll=int(ll)
ul=int(ul)

for j in range(ll,ul+1):
    n=j
    a=n
    s=0
    while(a!=0):
        r=a%10
        s=s*10+r
        a=a//10
    if(s==n):
                print(n,"is a palindrome number")