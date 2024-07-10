package it.saimao;

/*
Character type
char        - 2bytes (65535)
 */
public class L5_Character {
    public static void main(String[] args) {
        char c = 4096;
        c = 'a';
        c = 0x100f;
        c = '\u100e';

        System.out.println(c);
    }
}
