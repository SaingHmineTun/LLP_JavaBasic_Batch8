package it.saimao.L70_TryCatch;

public class UncheckedException {
    public static void main(String[] args) {

        String name = null;

        try {
            name.isEmpty();
            System.out.println("Success!");
        } catch (Exception e) {
            System.out.println("Name is null!");
        }
        System.out.println("Main END");

    }
}
