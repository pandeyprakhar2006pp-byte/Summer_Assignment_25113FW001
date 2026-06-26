//WAP to create number guessing game

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 25; // number to guess
        int attempts=0;
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Correct Guess! in: "+ attempts+ " attempts ");
                break;
            } else if (guess < number) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
        }
    }
}