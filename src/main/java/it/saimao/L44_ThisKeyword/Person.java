package it.saimao.L44_ThisKeyword;

public class Person {

    String username;
    int age;
    boolean active;

    Person(String username, int age, boolean active) {
        this(username);
    }

    Person(String username) {
        this.username = username;
    }

    Person(int age) {
        this.age = age;
    }
    Person(boolean active) {
        this.active = active;
    }

    Person() {
    }

    void init() {

    }

}
