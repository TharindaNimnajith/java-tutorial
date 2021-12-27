package java11;

@SuppressWarnings("UnusedAssignment")
public class Arithmetic {
    public static void main(String[] args) {
        var intValue1 = 56;
        var intValue2 = 42;

        var result1 = intValue1 + intValue2;
        var result2 = intValue1 - intValue2;
        var result3 = intValue1 * intValue2;
        var result4 = intValue1 / intValue2;
        var result5 = intValue1 % intValue2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        double value = -3.99999;
        long rounded = Math.round(value);
        System.out.println(rounded);
        double abs = Math.abs(value);
        System.out.println(abs);

        int x = 1;
        System.out.println(x);  // 1
        System.out.println(x++);  // 1
        System.out.println(++x);  // 3
        System.out.println(x--);  // 3
        System.out.println(--x);  // 1
        System.out.println(x += 1);  // 2
        System.out.println(x -= 1);  // 1
        System.out.println(x *= 2);  // 2
        System.out.println(x /= 2);  // 1
    }
}
