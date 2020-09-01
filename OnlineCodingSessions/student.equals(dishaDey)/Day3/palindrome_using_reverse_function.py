# Palindrome using reverse function.

def main():

	n = int(input("Enter an integer: "))

	if (n == reverse(n)):

		print("Palindrome.")

	else :

		print("Not a palindrome.")

def reverse(n):

	rev = 0

	while (n != 0):

		rev = rev * 10 + n % 10

		n //= 10

	return rev

if __name__ == "__main__":
	main()