#floyd's triangle
'''
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15
'''

c=1
for i in range (2,7):
    for j in range (1,i):
        print(c,end='\t')
        c=c+1
    print()