package it.saimao.L43_GlobalVsLocal;
/*
Global > Local > Block
 */
public class Car {
    String name; // State
    void drive() {
        String def = "Sai"; // Local scope
        System.out.println(name);
    }

    void horn() {
        char ch = 'a';
        if (true) {
            int x = 10;
            System.out.println(ch);
        }
        System.out.println(ch);
    }

    Car() {
        System.out.println(name);
    }

}
