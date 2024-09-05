package it.saimao;

public class L57_MainAndVararg {
    public static void main(String... args) {
        int[] nums = {1, 2, 3, 4, 5};
        print();
    }


    /*
    var arg = variable arguments
     */
    public static void print(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

}
