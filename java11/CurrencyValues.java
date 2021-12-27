package java11;

import java.math.BigDecimal;

public class CurrencyValues {
    public static void main(String[] args) {
        double value = .012;

        double sum = value + value + value;
        System.out.println(sum);

        var stringValue = Double.toString(value);
        var bigValue = new BigDecimal(stringValue);
        var bigValueSum = bigValue.add(bigValue).add(bigValue);
        var bigValueSumDouble = bigValueSum.doubleValue();
        System.out.println(bigValueSumDouble);
    }
}
