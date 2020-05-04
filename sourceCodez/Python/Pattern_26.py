'''
1       2       3       
        4
5       6       7       
        8
9       10      11
'''
l=int(input('levels :'))
c=1
if(l>0):
    for j in range(3):
        print(c,end='\t')
        c=c+1
    print()
for i in range(l-1):
    print('\t',end='')
    print(c,end='')
    print()
    c=c+1
    for j in range(3):
        print(c,end='\t')
        c=c+1
    print()