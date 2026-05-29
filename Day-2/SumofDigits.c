//Sum of digits of a number
#include<stdio.h>
int main(){
    int n,sum=0,i;
    printf("Enter a number: ");
    scanf("%d", &n);
    while(n != 0){
        i = n % 10; // Get the last digit
        sum += i; // Add the last digit to the sum
        n /= 10; // Remove the last digit
    }
    printf("The sum of digits is: %d", sum);
}