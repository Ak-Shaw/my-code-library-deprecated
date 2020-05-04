'''
Problem statement
You will be given a single string and two positive integers denoting indices. 
You need to change the case of the characters at those indices,i.e change 
uppercase to lowercase and lowercase to uppercase. It is guaranteed that 
all characters in the string are alphabets.
Input
The first line contains N, the length of string.
The next line contains a single string.
Two integers, x and y, in next line separated by space.
Output
Print the string after altering the case of characters at those indices
Constraint
1 ≤ string.length ≤ 40
0 ≤ x,y ≤ string.length
Sample Input
6
Dcoder
0 3
Sample Output
dcoDer
'''

#method to invert the case
def changeCase(c):
    if(c.isupper()):
        return c.lower()
    elif(c.islower()):
        return c.upper()
        
n=int(input())

#applying constraint
if(n<1 or n>40):
	print('1 ≤ string.length ≤ 40')
	exit()

s=input()
l=len(s)

#applying constraint
if(l!=n):
	print('string length mis-match')
	exit()

x,y=input().split()
x=int(x)
y=int(y)

#changing the case of alphabet at index x
s=s[0:x]+changeCase(s[x])+s[x+1:]

#changing the case of alphabet at index y
s=s[0:y]+changeCase(s[y])+s[y+1:]


'''
the above two statements invert the case at 
indices x and y
for a given index, suppose x,the statement
slices the left hand side of character at 
index x of the string, adds it to the alphabet
at index x after inverting the case, then adds 
the right hand part of the string
'''
print(s)