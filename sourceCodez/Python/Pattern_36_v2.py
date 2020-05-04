'''
n=5

1
10
101
1010
10101

'''

n=int(input('size :'))
t=0
for i in range(n):
    t*=10
    if(i%2==0):
        t+=1    
    print(t)