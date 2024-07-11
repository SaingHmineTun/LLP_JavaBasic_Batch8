package it.saimao;

public class L17_StringMethods {
    public static void main(String[] args) {
        // Lowercase and Uppercase
        String str = "Hello World";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // Is empty and is blank
        String str2 = "   ";
        boolean empty = str2.isEmpty();
        System.out.println("Empty " + empty);
        boolean blank = str2.isBlank();
        System.out.println("Blank " + blank);

        // Check for equality String Pool
        String sai = "sai";
        String mai = "sai";
        boolean equalAddress = sai == mai; // True if two objects reference to single address!
        boolean isEqual = sai.equals(mai);
        System.out.println("Is Equal " + isEqual);
        boolean isEqualIgnoreCase = sai.equalsIgnoreCase(mai);
        System.out.println("Is Equal Ignore case " + isEqualIgnoreCase);

        System.out.println("Starts with " + str.startsWith("Hell"));
        System.out.println("Ends With " + str.endsWith("d"));
        System.out.println("Contains " + str.contains("ll"));

        // String concatenation
        String saisai = sai.concat(" ".concat(mai.concat("!")));
        saisai = sai + " " + mai + "!";
        System.out.println(saisai);

        String result = "$" + 1 + true + 3;
        System.out.println(result);

    }
}
