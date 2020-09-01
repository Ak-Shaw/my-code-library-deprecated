# for loops in python

# Basic structure of a for loop in python

'''

Typical for loop in Python

for i in range(a, b, c):
	""" BODY """

'''
# a -> 	intial value of i
# b -> 	max value of i is b - 1, such that the 
#		loop has a condition like (i < b)
# c -> 	incrementation value of i

''' 

Equivalent for loop in C / C++ / Java / etc..

for (i = a; i < b; i += c) {

	// BODY
}

'''

''' EXAMPLE '''

# for i in range(1, 6, 1):
# 	print(i)

# Some types of for loops

#1. 
'''

for i in range(b):
	""" BODY """

In such a case, a = 0 and c = 1.

It is equivalent to:

for i in range(0, b, 1):
	""" BODY """

'''

#2.
'''

for i in range(a, b):
	""" BODY """

In such a case, c = 1.

It is equivalent to:

for i in range(a, b, 1):
	""" BODY """

'''

#3. The typical for loop in Python as mentioned above.

#4. For - Each loop

'''

for i in a:
	print(i)

# Where a is a list

'''
''' 
EXAMPLE:

a = [1, "Disha", 3, "CBSE", 5]

for i in a:
	print(i)

'''