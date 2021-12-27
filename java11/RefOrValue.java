package java11;

@SuppressWarnings({"ParameterCanBeLocal"})
public class RefOrValue {
    public static void main(String[] args) {
        // for primitive types - pass by value (copy is passed)
        int x = 1;
        System.out.println(x);
        increment(x);
        System.out.println(x);

        // strings (immutable) - pass by value (copy is passed)
        String original = "Original";
        System.out.println(original);
        changeString(original);
        System.out.println(original);

        // for objects, arrays - pass by reference
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[0]);
        incrementArr(arr);
        System.out.println(arr[0]);
    }

    private static void increment(int x) {
        x++;
        System.out.println("Inside: " + x);
    }

    private static void incrementArr(int[] arr) {
        arr[0]++;
        System.out.println("Inside: " + arr[0]);
    }

    private static void changeString(String original) {
        original = "New";
        System.out.println("Inside: " + original);
    }
}
