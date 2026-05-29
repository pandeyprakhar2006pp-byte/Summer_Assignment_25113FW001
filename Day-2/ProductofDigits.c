//Product of Digits 
#include<stdio.h>
int main(){
    int n, product=1, i;
    printf("Enter a number: ");
    scanf("%d", &n);
    while(n != 0){
        i = n % 10; // Get the last digit
        product *= i; // Multiply the last digit with the product
        n /= 10; // Remove the last digit
    }
    printf("The product of digits is: %d", product);
    return 0;
}