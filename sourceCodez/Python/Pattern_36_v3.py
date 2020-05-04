'''
n=5

1
10
101
1010
10101

'''

n=int(input('size :'))

l=[]
s=''
for i in range(n):
    if(i%2==0):
        s=s+'1'
    else:
        s=s+'0'
    l.append(s)
for i in l:
    print(i)