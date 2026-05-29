//Number is Pallindrome or not
#include <stdio.h>
int main() {
    int n, reverse = 0, i, original;
    printf("Enter a number: ");
    scanf("%d", &n);
    original = n; // Store the original number
    while (n != 0) {
        i = n % 10; // Get the last digit
        reverse = reverse * 10 + i; // Append the last digit to the reverse
        n /= 10; // Remove the last digit
    }
    if (original == reverse) {
        printf("The number is a palindrome.");
    } else {
        printf("The number is not a palindrome.");
    }
    return 0;
}