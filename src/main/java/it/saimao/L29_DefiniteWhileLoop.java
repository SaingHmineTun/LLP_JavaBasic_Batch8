package it.saimao;

public class L29_DefiniteWhileLoop {
    public static void main(String[] args) {
        System.out.println("Started");
        int i = 0; // 1. Initialize value
        while (i < 10) { // 2. Check condition
            System.out.println("I is " + i);
            i++; // 3. Update value
        }
        System.out.println("Ended");
    }
}
/*
String email = "admin@gmail.com";
int pin = 13579;

Enter your email => myEmail
Enter your pin => myPin

myEmail = email and myPint = pin ==> Login Success
myEmail = email but myPin != pin => Incorrect pin
myEmail != email but myPin = pin => Incorrect email
myEmail != email and myPint != pin => Login Failed

 */
