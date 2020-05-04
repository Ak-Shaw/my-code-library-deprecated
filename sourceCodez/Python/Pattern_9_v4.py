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

for i in range (n+1):
    for j in range (i):
        print(i,end="")
    print()