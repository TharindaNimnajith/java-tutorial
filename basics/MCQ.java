package basics;

import java.util.Scanner;

public class MCQ {
    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Saturn";

        @SuppressWarnings("UnnecessaryLocalVariable")
        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Choose one: " + choiceOne + ", " + choiceTwo + ", " + choiceThree);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (correctAnswer.equalsIgnoreCase(input))
            System.out.println("Congrats! That's the correct answer.");
        else
            System.out.println("You are incorrect. The correct answer is " + correctAnswer + ".");
    }
}
