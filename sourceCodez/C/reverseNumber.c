#include <stdio.h>

int reverse(int n) {

	int reverse = 0;

	while (n > 0) {

		reverse = reverse * 10 + n % 10;

		n /= 10;
	}

	return reverse;
}

int main() {

	printf("number: ");
	int n;
	scanf("%d", &n);

	printf("reverse of %d is %d\n", n, reverse(n));

	return 0;
}