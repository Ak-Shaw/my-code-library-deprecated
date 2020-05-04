#bubble sort on a list of n integers

l=[]
n=int(input('limit :'))
print('\nenter',n,'integers :')
for i in range(n):
    a=int(input())
    l.append(a)
print('\nlist elements are :',l)

for i in range(n-1):
    for j in range(n-1-i):
        if(l[j]>l[j+1]):
            l[j],l[j+1]=l[j+1],l[j]
            
print('\nsorted list elements are :',l)
