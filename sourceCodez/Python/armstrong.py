'''
a number whose sum of cube of digits is same as the original number is 
known as armstrong number

eg, 153

1^3+5^3+3^3
=1+125+27
=153
'''
n=int(input("enter a number :"))
a=n
s=0
while(a!=0):
    r=a%10
    s=s+r*r*r
    a//=10
if(n==s):
    print(n,"is armstrong")
else:
    print(n,"is not armstrong")
