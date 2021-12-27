package java11;

@SuppressWarnings({"ConstantConditions", "unused"})
public class ErrorHandling {
    public static void main(String[] args) {
        // String s = null;
        String s = "";

        try {
            var sub = s.substring(1);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null pointer: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Out of bounds: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Other: " + e.getMessage());
        } finally {
            System.out.println("Hi");
        }

        System.out.println("Hello");
    }
}
