#Spy number
'''
    123
    1+2+3=6
    1*2*3=6
'''
n=int(input('enter a number:'))
s=0
p=1
while(n!=0):
    r=n%10
    s=s+r
    p=p*r
    n=n//10
if(s==p):
    print("spy")
else:
    print("not spy")