package java11;

@SuppressWarnings("UnnecessaryLocalVariable")
public class Conversion {
    public static void main(String[] args) {
        short sh = 100;
        int i = sh;
        long l = i;
        short val = (short) l;
        System.out.println(sh);
        System.out.println(i);
        System.out.println(l);
        System.out.println(val);
    }
}
