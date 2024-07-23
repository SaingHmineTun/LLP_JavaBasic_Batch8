package it.saimao;

import java.util.Scanner;

public class L26_NewSwitch {
    public static void main(String[] args) {

        System.out.println("Please enter student's grade");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        switch (grade) {
            case 1, 2, 3, 4 -> {
                System.out.println("Go to primary school department");
            }
            case 5, 6, 7, 8 -> {
                System.out.println("Go to middle school department");
            }
            case 9, 10 -> {
                System.out.println("Go to high school department");
            }
            default -> {
                System.out.println("Go to head master's office!");
            }
        }

    }
}
