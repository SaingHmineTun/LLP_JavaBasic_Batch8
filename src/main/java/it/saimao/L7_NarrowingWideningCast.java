package it.saimao;

public class L7_NarrowingWideningCast {
    public static void main(String[] args) {
        // Widening cast
        byte b = 127;
        short s = b; // byte -> short
        int i = s;
        long l = i;
        double d = l;

        // Narrowing (Explicitly cast)
        short sh = 130;
        byte by = (byte) sh;
        System.out.println(by);

    }
}
