#1+4+9+16+25+.....+nth term
n=int(input('enter the limit : '))
s=0
print('\nseries elements :\n')
for i in range(1,n+1):
    b=i*i
    print(b,end=' ')
    s=s+b
print('\n\nsum of series =',s)