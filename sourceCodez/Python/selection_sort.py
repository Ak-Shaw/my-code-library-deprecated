#selection sort(also called sequential sort) on a list of n integers

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
