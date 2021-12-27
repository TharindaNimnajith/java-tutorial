package java11;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Formatting {
    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        var numberInstance = NumberFormat.getNumberInstance();
        System.out.println(numberInstance.format(doubleValue));

        var integerInstance = NumberFormat.getIntegerInstance();
        System.out.println(integerInstance.format(doubleValue));

        integerInstance.setGroupingUsed(false);
        System.out.println(integerInstance.format(doubleValue));

        var locale = Locale.getDefault();
        var localeNumberInstance = NumberFormat.getNumberInstance(locale);
        System.out.println(localeNumberInstance.format(doubleValue));
        System.out.println("--------------------------------");

        locale = new Locale("de", "DE");
        localeNumberInstance = NumberFormat.getNumberInstance(locale);
        System.out.println(localeNumberInstance.format(doubleValue));
        var currencyInstance = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyInstance.format(doubleValue));
        System.out.println("--------------------------------");

        locale = new Locale("en", "US");
        localeNumberInstance = NumberFormat.getNumberInstance(locale);
        System.out.println(localeNumberInstance.format(doubleValue));
        currencyInstance = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyInstance.format(doubleValue));
        System.out.println("--------------------------------");

        var decimalFormat = new DecimalFormat("$00.00");
        System.out.println(decimalFormat.format(1));
        System.out.println("--------------------------------");

        // string interpolation
        var item = "Shirt";
        var size = "M";
        var price = 14.99;
        var color = "Red";
        var template = "Clothing item: %s, size %s, color %s, $%.2f";
        var itemString = String.format(template, item, size, color, price);
        System.out.println(itemString);
    }
}
