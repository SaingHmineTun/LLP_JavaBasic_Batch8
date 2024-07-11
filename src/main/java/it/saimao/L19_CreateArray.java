package it.saimao;

public class L19_CreateArray {
    public static void main(String[] args) {
        String[] names = {"Buffy", "Luffy"};
        char[] chars = {'a', 'b', 'c', 4096};

        // Accessing array value
        String name = names[0];
        char character = chars[2];
        System.out.println(character);

        names[1] = "Sai";
        System.out.println(names[1]);

    }
}
