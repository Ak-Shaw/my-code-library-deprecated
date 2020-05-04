#linear search on a list of n integers

l=[]
n=int(input('limit :'))
print('\nenter',n,'integers :')
for i in range(n):
    a=int(input())
    l.append(a)
print('\nlist elements are :',l)

e=int(input('enter element to be searched :'))

k=False

for i in range(n):
    if(l[i]==e):
        k=True
        break
        
if(k==True):
    print('element found at index',i)
else:
    print('element absent')