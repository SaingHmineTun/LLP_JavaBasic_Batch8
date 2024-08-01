package it.saimao.L37_ClassAndObject;

import java.util.Random;

/*
Default value for stata
1. byte, short, int, long, float, double, char => 0
2. boolean => false
3. Reference => null
 */
public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.brand = "Oppo";
        phone.ram = 6;
        phone.powerOn = true;

        String brand = phone.brand;
        System.out.println("Brand : " + brand);
        System.out.println("Ram : " + phone.ram);
        System.out.println("Power on : " + phone.powerOn);

        Phone phone2 = new Phone(); // Object, Instance

        phone2.brand = "Oppo";
        phone2.ram = 6;
        phone2.powerOn = true;

        System.out.println(phone2);
        System.out.println(phone);

        boolean isSameReference = phone == phone2;
        System.out.println(isSameReference);

        System.out.println("###########################");
        Phone phone3 = phone2;
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone2 == phone3);

        // Equality

        /*
        Primitive => Stack Memory
        Reference => Heap Memory
         */

        System.out.println(new Phone().brand);

    }
}
