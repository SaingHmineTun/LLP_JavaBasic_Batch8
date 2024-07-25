package it.saimao;

public class L36_NestedFor {
    public static void main(String[] args) {

        char[][] chars = {
                {'a', 'b', 'c'},
                {'d'},
                {'e', 'f', 'g', 'h', 'i', 'j'}
        };
        for (int i = 0; i < chars.length; i++) {
            for (int x = 0; x < chars[i].length; x++) {
                System.out.print(chars[i][x] + " ");
            }
            System.out.println();
        }

        System.out.println("######################");
        for (char[] row : chars) {
            for (char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
/*
Dice rolling

Infinite
Random => 1 to 6
Input your guess => 1 to 6
If not right => Try again
If right => You guess it correctly!


 */










