package it.saimao;

/*
%d - decimal
%c - character
%x - hexa-decimal
%o - octal decimal
 */
public class L6_Printf {
    public static void main(String[] args) {
        int character = 0x1000;
        System.out.println(character);
        System.out.printf("%d %c %x %o", character, character, character, character);
    }
}
