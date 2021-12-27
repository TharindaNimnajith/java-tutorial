package java11.months;

import java.time.LocalDateTime;

public class MonthsConditionsV2 {
    public static void main(String[] args) {
        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

        String message;

        if (monthNumber <= 3)
            message = "That's in Quarter 1!";
        else if (monthNumber <= 6)
            message = "That's in Quarter 2!";
        else
            message = "That isn't the first half of the year";

        System.out.println(message);
    }
}
