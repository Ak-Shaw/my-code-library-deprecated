# accept an integer and print the number of digits

n = int(input("enter an integer: "))

count = 0

while (n != 0):
	# print("n = ", n)
	n //= 10	# n = n // 10
	count += 1	# count = count + 1

print("number of digits = ", count)
