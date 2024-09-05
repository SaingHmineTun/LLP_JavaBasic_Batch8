package it.saimao;

public class L58_TypeCasting {
    public static void main(String[] args) {

        String numString = "1234";
        int numInt = Integer.valueOf(numString); // String to int
        System.out.println(numInt + 1);

        String boolString = "1234";
        boolean bool = Boolean.valueOf(boolString); // String to boolean
        System.out.println(bool);

        String charString = "ABCD"; // array of char
        System.out.println(charString.charAt(2)); // String to char


        int num = 1000;
        String numStr = String.valueOf(num); // int to String
        String boolStr = String.valueOf(true); // boolean to String
        String charStr = String.valueOf(new char[]{'a', 'b'}); // char to String

    }
}
