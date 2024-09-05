package it.saimao.L49_Polymorphism;

public class Phone {
    protected String brand;
    protected int ram;

    public void call(String phoneNumber) {
        System.out.println("Calling to " + phoneNumber);
    }

    public void message(String phoneNumber, String message) {
        System.out.println("Messaging from " + phoneNumber + " : " + message);
    }

    public void printInfo() {
        System.out.println("Phone Brand: " + brand);
        System.out.println("Phone RAM: " + ram);
    }


}
