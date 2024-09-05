package it.saimao.L52_AbstractClass;

public abstract class Animal {

    public String name;

    public abstract void makeSound();

    public void printName() {
        System.out.println("I'm " + name);
    }

}
