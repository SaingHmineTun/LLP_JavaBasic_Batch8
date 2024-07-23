package it.saimao;

import java.util.Random;

public class L27_Random {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = rd.nextInt(10);
        System.out.println(number);
    }
}
