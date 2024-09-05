package it.saimao.L63_AnonymousClass;

public class Main {
    public static void main(String... args) {
        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Woof Woof");
            }
        };

        Animal cat = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Meow Meow");
            }
        };

        speak(dog, cat);

    }

    /*
    vararg is array -> variable arguments
     */

    public static void speak(Animal... animals) {
        for (var animal : animals) {
            animal.makeSound();
        }
    }

}
