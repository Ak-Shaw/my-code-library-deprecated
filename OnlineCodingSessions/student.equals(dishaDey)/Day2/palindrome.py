# Accept an integer and check whether it's a palindrome.

n = int(input("Enter an integer: "))

copy = n

rev = 0

while (n != 0):

	rev = rev * 10 + n % 10

	n //= 10

if (copy == rev):

	print ("Palindrome.")

else :

	print ("Not a palindrome.")