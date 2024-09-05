package it.saimao.L54_Final;
/*
final class     => Cannot extend
final method    => Cannot overwrite
final variable  => Cannot re-assign
 */
public class Main {

    public final static String owner = "Sai";

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.sup();
        System.out.println(owner);
    }
}
