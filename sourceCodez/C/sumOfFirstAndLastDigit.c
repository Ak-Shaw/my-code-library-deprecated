#include <stdio.h>

int getFirstDigit(int n) {

	int digit = 0;

	while (n > 0) {

		digit = n % 10;

		n /= 10;
	}

	return digit;
}

int getLastDigit(int n) {

	return n % 10;
}

int sumOfFirstAndLastDigit(int n) {

	int firstDigit = getFirstDigit(n);
	int lastDigit = getLastDigit(n);

	return firstDigit + lastDigit;
}

int main() {

	printf("number: ");
	int n;
	scanf("%d", &n);

	printf("sum of first and last digit of %d is %d\n", n, sumOfFirstAndLastDigit(n));

	return 0;
}