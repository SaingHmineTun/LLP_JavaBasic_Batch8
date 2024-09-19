package it.saimao.L73_ThrowException;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.init();
    }

    private void init() throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter number between 1 and 6");
            int rdNum = new Random().nextInt(6) + 1;
            int num = sc.nextInt();
            if (num > 0 && num < 7) { // 1, 2, 3, 4, 5, 6
                if (num == rdNum) {
                    System.out.println("You won!");
                    break;
                } else {
                    System.out.println("Try again");
                }
            } else {
                throw new Exception("Number not between 1 and 6"); // Checked Exception
            }
        }
    }
}
