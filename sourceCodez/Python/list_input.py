#take n numbers as input, store them in a list and display the same

l=[]
n=int(input('limit :'))
print('\nenter',n,'integers :')
for i in range(n):
    a=int(input())
    l.insert(i,a)
print('\nlist elements are :',l)