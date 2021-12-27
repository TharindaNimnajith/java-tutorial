package java11;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        var input = scanner.nextLine();
        System.out.println(input);

        System.out.print("Enter a number: ");
        var num = scanner.nextInt();
        System.out.println(num);

        System.out.print("Enter a numeric value: ");
        var d1 = scanner.nextDouble();
        System.out.print("Enter a numeric value: ");
        var d2 = scanner.nextDouble();
        double result = d1 / d2;
        System.out.println("The answer is " + result);
    }
}
