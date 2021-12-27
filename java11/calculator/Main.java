package java11.calculator;

import java11.calculator.util.Helper;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("EnhancedSwitchMigration")
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        double d1, d2;
        try {
            System.out.print("Enter a numeric value: ");
            d1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter a numeric value: ");
            d2 = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("InputMismatchException: " + e.getMessage());
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Other: " + e.getMessage());
            return;
        }

        System.out.print("Select an operation (+ - * /): ");
        var operation = scanner.nextLine();

        double result;
        switch (operation) {
            case "+":
                result = Helper.addValues(d1, d2);
                break;
            case "-":
                result = Helper.subtractValues(d1, d2);
                break;
            case "*":
                result = Helper.multiplyValues(d1, d2);
                break;
            case "/":
                result = Helper.divideValues(d1, d2);
                break;
            default:
                System.out.println("You didn't choose a valid operation");
                return;
        }
        System.out.println("The answer is " + result);
    }
}
