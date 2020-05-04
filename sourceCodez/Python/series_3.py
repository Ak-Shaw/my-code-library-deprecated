#s=0+3+8+15+24+......+nth term
n=int(input('enter the limit : '))
s=0
print('\nseries elements :\n')
for i in range(1,n+1):
    b=i*i-1
    print(b,end=' ')
    s=s+b
print('\n\nsum of series =',s)