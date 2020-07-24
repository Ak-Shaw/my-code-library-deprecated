#include<stdio.h>

// Returns the number of factors of n.
int numberOfFactors(int n) {

	int count = 0;

	for (int i = 1; i <= n; i++) {

		if (n % i == 0) {
			count++;
		}
	}

	return count;
}

// Will return 1 if n is prime.
// Will return 0 if n is not prime.
int isPrime(int n) {

	if (numberOfFactors(n) == 2) {
		return 1;
	}

	return 0;
}

int main() {

	int n;
	printf("number: ");
	scanf("%d", &n);

	if (isPrime(n)) {
		printf("prime number\n");
	} else {
		printf("not a prime number\n");
	}

	return 0;
}