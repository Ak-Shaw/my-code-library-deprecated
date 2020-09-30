# Displaying the fibonacci series.

n = int(input("enter limit: "))

a = -1
b = 1

while (n >= 0):

	c = a + b
	print(c, end = " ")

	a = b
	b = c
	n -= 1

print()