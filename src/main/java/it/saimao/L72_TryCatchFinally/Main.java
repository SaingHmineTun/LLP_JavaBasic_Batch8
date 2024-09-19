package it.saimao.L72_TryCatchFinally;

public class Main {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally!");
        }

    }
}
