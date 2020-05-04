#1+2+3+............+nth term
n=int(input('enter a number : '))
i=1;s=0
while(i<=n):
    s=s+i
    i=i+1
print('sum of series =',s)