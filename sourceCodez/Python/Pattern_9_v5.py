'''


1
22
333
4444
55555
.
.
.
n levels


'''
n=int(input("size :"))
c=''
for i in range(1,n+1):
    c=c+i
    print(i*c)
    c=''