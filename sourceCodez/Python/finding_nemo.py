'''
Problem statement
Nemo is a little kid in Word-World who always gets mixed in a group of other words and gets lost. Marlin and Coral (Nemo's parents) are quite desperate and called you for help every time Nemo got lost. You helped for the first few times but got irritated when you were called upon again and again. So write an algorithm that would do your work for you. You will be given a group of words. You need to find 'Nemo' among these words and print its position.
Input
First line contains N, the number of words.
The next line contains N space-separated words.
Output
Print the position of the word 'Nemo' in the group.
Constraint
1 ≤ N ≤ 1000
1 ≤ word.length ≤ 50
Sample Input
6
This is a Nemo sample input
Sample Output
4
'''

n=int(input())

#applying constraint
if(n<1 or n>1000):
	print('1 ≤ N ≤ 1000')
	exit()

words=input().split()

count=0

#applying constraint
for word in words:
	if(len(word)>50):
		print('1 ≤ word.length ≤ 50')
		exit()
	count+=1

#applying constraint
if(count!=n):
	print('number of words should be',n)
	exit()

pos=1

#loop that iterates through the list of words in search of 'Nemo'
for word in words:
    if(word=='Nemo'):
        break
    pos+=1

if(pos>n):
    pos=0

#prints position of 'Nemo' if found else print 0
print(pos)