#binary search on a list of n integers
'''selection sort method'''

l=[]
n=int(input('limit :'))
print('\nenter',n,'integers :')
for i in range(n):
    a=int(input())
    l.append(a)
print('\nlist elements are :',l)

for i in range(0,n-1):
    m=i
    for j in range(i+1,n):
        if(l[j]<l[m]):
            m=j
    l[i],l[m]=l[m],l[i]
            
print('\nsorted list elements are :',l)

e=int(input('enter element to be searched :'))

lb=0
ub=n-1
k=False

while(lb<=ub):
    m=(lb+ub)//2
    if(e<l[m]):
        ub=m-1
    elif(e>l[m]):
        lb=m+1
    else:
        k=True
        break

if(k==True):
    print('element found at index',m,'of sorted list')
else:
    print('element absent')