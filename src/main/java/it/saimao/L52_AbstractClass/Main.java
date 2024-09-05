package it.saimao.L52_AbstractClass;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        confirm(animal1);
        Animal animal2 = new Cat();
        confirm(animal2);
    }

    public static void confirm(Animal animal) {
        animal.printName();
        animal.makeSound();
    }

}
