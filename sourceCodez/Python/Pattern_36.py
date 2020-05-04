'''
n=5

1
10
101
1010
10101

'''

n=int(input('size :'))
for i in range(n):
    for j in range(i+1):
        if(j%2==0):
            print(1,end='')
        else:
            print(0,end='')
    print()