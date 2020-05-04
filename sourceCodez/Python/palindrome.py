#palindrome number

'''

a number which is the same even if it is reversed is known as palindrome

101
121
132231
12421
'''

n=int(input('enter a number :'))
a=n
s=0
while(a!=0):
    r=a%10
    s=s*10+r
    a=a//10
if(s==n):
    print('palindrome')
else:
    print('not palindrome')