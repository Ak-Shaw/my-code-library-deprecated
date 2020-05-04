'''
duck number is a number which has zeroes present in it
3210
2304
5607
5048
'''

n=int(input('enter a number :'))
k=0
while(n!=0):
    r=n%10
    if(r==0):
        k=1
        break
    n=n//10
if(k==1):
    print('duck number')
else :
    print('not duck number')