'''
A number is said to be Buzz Number if it 
ends with 7 OR is divisible by 7.
'''

n = int(input("Enter an integer: "))

if (n % 10 == 7 or n % 7 == 0):

	print ("Buzz.")

else :

	print ("Not buzz.")