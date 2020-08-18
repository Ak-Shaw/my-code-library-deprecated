# accept a integer and print it's reverse

n = int(input("enter an integer: "))

rev = 0

while (n != 0):

	rev = rev * 10 + n % 10

	# print("rev = ", rev)

	n //= 10

print("reverse = ", rev)