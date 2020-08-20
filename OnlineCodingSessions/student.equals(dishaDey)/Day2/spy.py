'''
A number is a Spy number, if sum and product 
of all digits are equal. Example: Number 123 
is a Spy number, sum of its digits is 
6 (1+2+3 =6) and product of its digits is 
6 (1x2x3 = 6), sum and product are same, 
thus, 123 is a spy number.
'''

n = int(input("Enter an integer: "))

sum_of_digits = 0
product_of_digits = 1

while (n != 0):

	# Adding a digit to the sum.
	# sum_of_digits = sum_of_digits + n % 10
	sum_of_digits += n % 10 

	# Multiplying a digit with the product.
	# product_of_digits = product_of_digits * (n % 10)
	product_of_digits *= n % 10

	# Removing last digit.
	n //= 10

if (sum_of_digits == product_of_digits):

	print ("Spy.")

else:

	print ("Not spy.")