package basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;
        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(hasPerfectAttendance);

        char studentFirstInitial = 'K';
        char studentLastInitial = 'H';
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);

        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        char studentFirstInitialChar = studentFirstName.charAt(0);
        char studentLastInitialChar = studentLastName.charAt(0);
        System.out.println(studentFirstInitialChar);
        System.out.println(studentLastInitialChar);

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.print("What do you want to update it to? ");
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);

        System.out.print("Pick a number between 1 and 10: ");
        int inputtedNum = input.nextInt();
        if (inputtedNum < 5)
            System.out.println("inputtedNum < 5");
        else
            System.out.println("inputtedNum >= 5");

        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playing A");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = input.next();
            if (userInput.equals("yes"))
                isOnRepeat = false;
        }
        System.out.println("Playing B");

        input.close();

        double result = Math.pow(2, 5);
        System.out.println(result);
    }
}
