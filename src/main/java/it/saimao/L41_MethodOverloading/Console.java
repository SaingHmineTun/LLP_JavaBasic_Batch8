package it.saimao.L41_MethodOverloading;

/*
1. Parameter data type
2. Number of parameter
 */
public class Console {
    void write(String val) {
        System.out.println("String : " + val);
    }

    void write(int val) {
        System.out.println("Int : " + val);
    }

    void write(String val1, int val2) {
        System.out.println(val1 + " : " + val2);
    }

    void write() {
        System.out.println();
    }

    void write(Object object) {
        System.out.println("Object : " + object);
    }
}
/*
("Hello", "ell") => true
String contains/startsWith/endsWith (2 parameters)
String length ("Hello) => 5
 */