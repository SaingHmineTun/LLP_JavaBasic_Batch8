package it.saimao.L62_MethodLocalInnerClass;

public class Main {
    public static void main(String[] args) {
        class Dog implements Animal {
            @Override
            public void makeSound() {
                System.out.println("Woof Woof");
            }
        }

        Animal dog = new Dog();
        printUser(dog);
        printUser(new Dog());
        printUser(new Dog());

    }

    public static void printUser(Animal animal) {
        animal.makeSound();
        System.out.println(animal);
    }

}
