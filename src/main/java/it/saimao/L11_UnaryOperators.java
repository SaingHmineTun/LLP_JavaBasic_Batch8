package it.saimao;

public class L11_UnaryOperators {
    public static void main(String[] args) {
        int i = -5; // negative operator
        boolean b = !false; // true
        System.out.println(b);

        int x = ++i;
        System.out.println(x); // -4

        // System.out.println(i++); // take then increase (postfix operator)
        // System.out.println(++i); // increase then take (prefix operator)
        System.out.println(i);

    }
}
