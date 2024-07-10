package it.saimao;

/*
Arithmetic Operators
===================
int + int = int
int + float = float
float + int = float
float + float = float
 */
public class L10_ArithmeticOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        double z1 = x + y;
        System.out.println(z1); // Addition
        System.out.println(x - y); // Subtraction
        System.out.println(x * y); // Multiplication
        System.out.println(x / y); // Division
        System.out.println(x % y); // Modulus

        System.out.println(10/20.0);
    }
}
