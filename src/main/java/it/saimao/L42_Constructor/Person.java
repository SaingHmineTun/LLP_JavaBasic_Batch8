package it.saimao.L42_Constructor;

public class Person {

    String username;
    int age;
    boolean active;

    Person(String username, int age, boolean active) {
        this.username = username; // this => this object
        this.age = age;
        this.active = active;
    }

    Person(String username) {
        this.username = username;
    }

    Person(int age) {
        this.age = age;
    }

    Person() {
    }

}
