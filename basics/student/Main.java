package basics.student;

public class Main {
    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile(
                "Sally", "Salmon", "Film", 3.75, 2022);
        StudentProfile profileTwo = new StudentProfile(
                "Max", "Tiffen", "Computer Science", 3.45, 2021);

        profileOne.incrementExpectedGraduationYear();
        System.out.println(profileOne.expectedYearToGraduate);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }
}
