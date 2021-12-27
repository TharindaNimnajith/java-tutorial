package basics;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Base of the triangle: ");
        double base = input.nextDouble();
        while (base <= 0) {
            System.out.print("That's invalid. Base of the triangle: ");
            base = input.nextDouble();
        }

        System.out.print("Height of the triangle: ");
        double height = input.nextDouble();
        while (height <= 0) {
            System.out.print("That's invalid. Height of the triangle: ");
            height = input.nextDouble();
        }

        double area = (base * height) / 2;
        System.out.println("The area is " + area);
    }
}
