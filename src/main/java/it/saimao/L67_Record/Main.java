package it.saimao.L67_Record;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob", true);
        Dog dog1 = new Dog("Bob", true);
        System.out.println(dog.getName());
        System.out.println(dog.equals(dog1));

        Cat cat = new Cat("Tom", "Meow", true);
        Cat cat2 = new Cat("Tom", "Meow", true);
        System.out.println(cat.name());
        System.out.println(cat.equals(cat2));

    }
}
