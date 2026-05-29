//Reverse the number
#include<stdio.h>
int main(){
    int n, reverse=0, i;
    printf("Enter a number: ");
    scanf("%d", &n);
    while(n != 0){
        i = n % 10; // Get the last digit
        reverse = reverse * 10 + i; // Append the last digit to the reverse
        n /= 10; // Remove the last digit
    }
    printf("The reverse of the number is: %d", reverse);
    return 0;
}