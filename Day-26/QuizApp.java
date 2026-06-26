//WAP to create quiz application
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Quiz Started!");

        System.out.println("1. AI stands for__");
        System.out.println("a) Automatic Intelligence  b) Artificial Intelligence  c) Advanced Internet");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B') {
            score++;
        }

        System.out.println("\n2. How many days are there in a week?");
        System.out.println("a) 5  b) 6  c) 7");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'c' || ans2 == 'C') {
            score++;
        }

        System.out.println("\n3. Who is known as the father of Artificial Intelligence?");
        System.out.println("a) John McCarthy  b) Alan Turing  c) Bill Gates");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'a' || ans3 == 'A') {
            score++;
        }
        System.out.println("\n4. Which language is commonly used for AI?");
        System.out.println("a) Java  b) C++  c) Python");
        char ans4 = sc.next().charAt(0);

        if (ans4 == 'c' || ans4 == 'C') {
            score++;
        }
        System.out.println("\n5. Which of the following is an AI chatbot?");
        System.out.println("a) Chatgpt  b) Safari  c) MS paint");
        char ans5 = sc.next().charAt(0);

        if (ans5 == 'a' || ans5 == 'A') {
            score++;
        }

        System.out.println("\nYour Score = " + score + "/5");

        
    }
}