package java11;

import org.jetbrains.annotations.NotNull;

public class Arguments {
    public static void main(String @NotNull [] args) {
        System.out.println(args[0] + " - " + args[1]);
    }
}
