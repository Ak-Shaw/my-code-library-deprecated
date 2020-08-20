'''
Armstrong number is a number that is equal 
to the sum of cubes of its digits. For 
example 0, 1, 153, 370, 371 and 407 are the 
Armstrong numbers. 

It is also known as Narcissistic number.
'''

n = int(input("Enter an integer: "))

copy = n

arm = 0

while (n != 0):

	arm = arm + (n % 10) ** 3

	n //= 10

if (copy == arm):

	print ("Armstrong.")

else : 

	print ("Not Armstrong.")