#1+2+3+............+nth term
n=int(input('enter the limit : '))
s=0
print('\nseries elements :\n')
for i in range(1,n+1):
    b=i#formula
    print(b,end=' ')
    s=s+b
print('\n\nsum of series =',s)