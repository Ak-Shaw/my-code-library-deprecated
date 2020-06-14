#include<stdio.h>

int sumOfDigits(int n) {

	int sumOfDigits = 0;

	while (n > 0) {

		sumOfDigits += n % 10;

		n /= 10;
	}

	return sumOfDigits;
}

int main() {

	printf("number: ");
	int n;
	scanf("%d", &n);

	printf("sum of digits of %d is %d\n", n, sumOfDigits(n));

	return 0;
}
