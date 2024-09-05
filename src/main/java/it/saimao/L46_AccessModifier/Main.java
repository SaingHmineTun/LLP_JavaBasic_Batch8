package it.saimao.L46_AccessModifier;

import it.saimao.L46_AccessModifier.model.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "Oppo";
        phone.printInfo();
    }
}
