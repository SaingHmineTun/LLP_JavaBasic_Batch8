package it.saimao;

public class L15_TernaryOperator {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int bigger = x > y ? x : y;
        System.out.println(bigger);

        int z = 12345;
        String gender = z % 2 == 0 ? "Male" : "Female";
        System.out.println(gender);
    }
}
