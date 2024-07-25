package it.saimao;

import java.util.Scanner;

public class L30_DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number!");
        int num = sc.nextInt();
        int i = 0;
        do {
            System.out.println("I is " + i);
            i++;
        } while (i < num);
    }
}
