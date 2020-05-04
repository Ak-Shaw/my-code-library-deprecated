'''
Problem statement
A word or a sentence is called a pangram if all the characters of this 
language appear in it at least once, either in lowercase or in uppercase. 
You are given a string S consisting of lowercase and uppercase English 
letters. If the string is a pangram, print "YES" else print "NO", without the double quotes.
Input
A single string S.
Output
Print "YES", if the string is a pangram, else print "NO".
Constraint
1 ≤ S.length ≤ 100
Sample Input
QuickWaftingZephyrsVexBoldJim
Sample Output
YES
'''

s=input()

#applying constraint
if(len(s)>100):
	print('1 ≤ S.length ≤ 100')
	exit()

s=s.upper()

alpha=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']

flag=1

'''
nested loop which counts the frequency 
of each character and sets flag to 0
if an alphabet is encountered with 0
frequency
'''
for i in alpha:
	f=0
	for j in s:
		if(i==j):
			f+=1
	if(f<1):
		flag=0
		break

if(flag==1):
	print('YES')
else:
	print('NO')