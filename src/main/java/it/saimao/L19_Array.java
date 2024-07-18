package it.saimao;

public class L19_Array {
    public static void main(String[] args) {

        // Create an array
        int[] numbers = {5, 10, 15, 20};
        String[] names = {"Luffy", "Nami", "Zoro"};

        // Retrieve value from array
        int third = numbers[2];
        String first = names[0];
        System.out.println(first.toUpperCase());

        // Update value in array
        System.out.println("Before update - " + names[1]);
        names[1] = "Sanji";
        System.out.println("After update - " + names[1]);

        // Try adding new value
        numbers[4] = 15;
    }
}
