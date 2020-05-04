'''
Problem statement
Natural numbers are the set of positive integers, which ranges from 1 to 
infinity excluding fractional part. Natural numbers are whole numbers 
excluding zero. Zero is the only whole number which is not a natural 
number. An array is special if all the elements are natural numbers. 
Find whether the given array is special or not.
Input
The first line of input contains a single integer N denoting the array size.
The second line of input contains N-space separated integers denoting the array.
Output
Print "Yes" if the array is special else print "No".
Constraint
1<=N<=100.
0<=Arrays elements<=100.
Sample Input
4
0 1 2 3
Sample Output
No
'''

n=int(input())

#applying constraint
if n<1 or n>100:
	print('1<=N<=100')
	exit()

a=input().split()

flag=1

for i in range(n):
	a[i]=int(a[i])
	if a[i]<0 or a[i]>100:
		flag=0

#applying constraint
if(flag==0):
	print('0<=Arrays elements<=100')
	exit()

#verifying special array and setting flag to 0 if not
for a in a:
	if a<1:
		flag=0

if flag==1:
	print('Yes')
else:
	print('No')