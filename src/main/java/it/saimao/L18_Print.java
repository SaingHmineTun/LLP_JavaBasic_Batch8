package it.saimao;

public class L18_Print {
    public static void main(String[] args) {
        String name = "Buffy";
        int age = 24;
        System.out.println("My name is " + name + ". I am " + age + " years old!");
        System.out.printf("My name is %s.%nI am %d years old.%n%.2f", name, age, 0.5);
    }
}