#reversing a number

n=int(input('enter a number :'))
a=n
s=0
while(a!=0):
    r=a%10
    s=s*10+r
    a=a//10
    
print('reverse of',n,'is',s)