package java11;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@SuppressWarnings({"CommentedOutCode", "WrapperTypeMayBePrimitive", "ConstantConditions", "StringEquality", "StringOperationCanBeSimplified", "NewObjectEquality"})
public class Variables {
    public static void main(String[] args) {
        byte b = 1;
        short sh = 1;
        int i = 1;
        var v = 1;
        // long l = 3_000_000_000;  // Integer number too large
        long l1 = 3_000_000_000L;  // explicit typing
        var l2 = 3_000_000_000L;  // inferred typing / implicit typing
        long l3 = 3000000000L;
        float f1 = (float) 3000000000.3434;
        float f2 = 3000000000.3434f;
        double d = 3000000000.3434;
        System.out.println(b);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(v);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d);
        System.out.println("--------------------------------");

        var myInt = 5;
        var myFloat = 5f;
        var myDouble = 5d;
        var myLong = 5L;
        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myLong);
        System.out.println("--------------------------------");

        String doubleValue = "156.5";
        Double doubleObject = Double.parseDouble(doubleValue);
        var byteValue = doubleObject.byteValue();
        var intValue = doubleObject.intValue();
        var floatValue = doubleObject.floatValue();
        // double doubleObject = Double.parseDouble(doubleValue);
        // var byteValue = (byte) doubleObject;
        // var intValue = (int) doubleObject;
        // var floatValue = (float) doubleObject;
        var stringValue = doubleObject.toString();
        System.out.println(byteValue);
        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(stringValue);
        System.out.println("--------------------------------");

        // int x = 3000000000;    // Integer number too large
        var unsigned = Integer.parseUnsignedInt("3000000000");
        System.out.println(unsigned);
        var result = Integer.divideUnsigned(unsigned, 2);
        System.out.println(result);
        System.out.println("--------------------------------");

        byte value = 127;
        System.out.println(value);
        if (value <= Byte.MAX_VALUE)
            value++;
        System.out.println(value);
        System.out.println("--------------------------------");

        boolean val1 = false;
        boolean val2 = true;
        var val3 = true;
        var val4 = !val3;
        int x = 1;
        var val5 = (x != 0);
        var s = "true";
        var val6 = Boolean.parseBoolean(s);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println("--------------------------------");

        char c1 = 'a';
        var c2 = '2';
        char c3 = '\u0024';
        var upper = Character.toUpperCase(c1);
        char[] characters = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(characters);
        var charArray = str.toCharArray();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(upper);
        System.out.println(characters);
        System.out.println(characters[0]);
        System.out.println(characters.length);
        System.out.println(Arrays.toString(characters));
        System.out.println(str);
        // System.out.println(str[0]);
        // System.out.println(str.length);
        System.out.println(str.length());
        System.out.println(charArray);
        System.out.println(charArray[0]);
        System.out.println(charArray.length);
        System.out.println(Arrays.toString(charArray));
        System.out.println("--------------------------------");

        String s1 = "Hello";
        String s2 = "Hello";
        var s3 = "Hello";
        String s4 = new String("Hello");
        String s5 = new String("Hello");
        var s6 = "HELLO";

        // incorrect
        if (s1 == s2)
            System.out.println("s1 == s2");  // get executed
        else
            System.out.println("s1 != s2");

        // incorrect
        if (s1 == s3)
            System.out.println("s1 == s3");  // get executed
        else
            System.out.println("s1 != s3");

        // incorrect
        if (s4 == s5)
            System.out.println("s4 == s5");
        else
            System.out.println("s4 != s5");  // get executed

        // correct
        if (s1.equals(s2))
            System.out.println("s1.equals(s2)");  // get executed
        else
            System.out.println("Not equal");

        // correct
        if (s1.equals(s3))
            System.out.println("s1.equals(s3)");  // get executed
        else
            System.out.println("Not equal");

        // correct
        if (s4.equals(s5))
            System.out.println("s4.equals(s5)");  // get executed
        else
            System.out.println("Not equal");

        // correct
        if (s4.equalsIgnoreCase(s6))
            System.out.println("s4.equalsIgnoreCase(s6)");  // get executed
        else
            System.out.println("NOT s4.equalsIgnoreCase(s6)");

        System.out.println("--------------------------------");

        int a = 1;
        var message = a < 2 ? "a < 2" : "a >= 2";
        System.out.println(message);
        System.out.println("--------------------------------");

        String str1 = "String 1";
        var str2 = "String 2";
        var str3 = new String("String 3");
        var str4 = str1 + " - " + str2 + " - " + str3 + " - " + 5;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        str4 += " - Hello!";
        System.out.println(str4);
        System.out.println(str1.toUpperCase());
        System.out.println(str1);
        System.out.println(str1.toLowerCase());
        System.out.println(str1.charAt(1));
        System.out.println(str1.indexOf('r'));
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(2, 4));
        var str5 = "  Welcome!  ";
        System.out.println(str5);
        System.out.println(str5.length());
        System.out.println(str5.trim());
        System.out.println(str5.trim().length());
        var bytes = str1.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        System.out.println("--------------------------------");

        var stringBuilder = new StringBuilder("Welcome");
        System.out.println(stringBuilder);
        stringBuilder.append(" to Galle!")
                .append(" Enjoy for ")
                .append(50)
                .append(" LKR");
        System.out.println(stringBuilder);
        var stringVal = stringBuilder.toString();
        System.out.println(stringVal);
        String howMany = 20 + " things";
        System.out.println(howMany);
        System.out.println("--------------------------------");

        int p = 42;
        var pStr = Integer.toString(p);
        System.out.println(p);
        System.out.println(pStr);
        boolean q = true;
        var qStr = Boolean.toString(q);
        System.out.println(q);
        System.out.println(qStr);
        long r = 10_000_000L;
        var rStr = Long.toString(r);
        System.out.println(r);
        System.out.println(rStr);
    }
}
