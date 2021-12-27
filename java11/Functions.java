package java11;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        double d1 = getInput(scanner, "Enter numeric value 1: ");
        double d2 = getInput(scanner, "Enter numeric value 2: ");

        double result = addValues(d1, d2);
        System.out.println("The sum is " + result);

        double resultOfFour = addValues(d1, d2, d1, d2);
        System.out.println("The sum of 4 is " + resultOfFour);

        double resultOfMultiple = addValues(d1, d2, d1, d2, d1, d2);
        System.out.println("The sum of multiple is " + resultOfMultiple);
    }

    private static double getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static double addValues(double d1, double d2) {
        return d1 + d2;
    }

    private static double addValues(double d1, double d2, double d3, double d4) {
        return d1 + d2 + d3 + d4;
    }

    private static double addValues(double... values) {
        int result = 0;
        for (var value : values)
            result += value;
        return result;
    }
}
