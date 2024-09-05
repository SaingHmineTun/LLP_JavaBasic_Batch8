package it.saimao.L49_Polymorphism;

import it.saimao.L49_Polymorphism.children.Android;
import it.saimao.L49_Polymorphism.children.Apple;
import it.saimao.L49_Polymorphism.children.Samsung;
/*
Object class is mother of all classes in java
 */
public class Main {
    public static void main(String[] args) {

        Phone android = new Android("Huawei", 12);
        Apple apple = new Apple("iPhone", 6);
        printInfo(new Phone());
        printInfo(android);
        printInfo(apple);
        printInfo(new Samsung(6));

        test(123);


        obj(123);


    }

    public static void obj(Object obj) {

    }

    public static void printInfo(Phone phone) {
        phone.printInfo();
    }


    public static void test(Object obj) {
        System.out.println(obj);
    }


}
