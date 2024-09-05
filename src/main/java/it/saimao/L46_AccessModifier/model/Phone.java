package it.saimao.L46_AccessModifier.model;

/*
Access Modifier
1) State
2) Behavior
3) Constructor
4) class
 */
public class Phone {
    public String brand; // default (package-private)

    public void printInfo() {
        System.out.println("Brand - " + brand);
    }

    public Phone() {

    }

}
