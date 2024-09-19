package it.saimao;

import java.util.Scanner;

public class L25_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = sc.next();
        System.out.println("Hello, " + name);
    }
}
