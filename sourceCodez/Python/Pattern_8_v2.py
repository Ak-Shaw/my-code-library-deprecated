'''
n=5

1
12
123
1234
12345

'''

n=int(input('size :'))
for i in range(n+1):
    for j in range(1,i+1):
        print(j,end='')
    print()