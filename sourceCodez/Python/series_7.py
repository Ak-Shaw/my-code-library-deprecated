#7!+14!+23!+34!...........+nth term
n=int(input('enter the limit : '))
s=0
print('\nseries elements :\n')
for i in range(1,n+1):
    n=(i+2)**2-2
    f=1
    while(n!=0):
        f=f*n
        n=n-1
    b=f
    print(b,end=' ')
    s=s+b
print('\n\nsum of series =',s)