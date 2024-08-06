package it.saimao.L39_MethodReturnType;

public class StringCase {
    String string;

    String toUpperCase() {
        char[] chars = string.toCharArray();
        String upper = "";
        for (char ch : chars) {
            if (ch >= 'a' && ch <= 'z') {
                upper += (char) (ch - 32);
            } else {
                upper += ch;
            }
        }

        return upper;
    }

    String toLowerCase() {
        System.out.println((char) 4096); // int to char
        System.out.println((int) ' '); // char to int

        char[] chars = string.toCharArray();
        String lower = "";
        for (char ch : chars) {
            if (ch >= 'A' && ch <= 'Z') {
                lower += (char) (ch + 32);
            } else {
                lower += ch;
            }
        }

        return lower;
    }
}
