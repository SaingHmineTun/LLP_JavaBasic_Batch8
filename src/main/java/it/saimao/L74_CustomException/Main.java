package it.saimao.L74_CustomException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number between 1 and 6");
        int num = sc.nextInt();
        if (num > 0 && num <= 6) {
            System.out.println("Valid");
        } else {
            throw new UncheckedInvalidNumberException("Invalid number!");
        }

    }
}
