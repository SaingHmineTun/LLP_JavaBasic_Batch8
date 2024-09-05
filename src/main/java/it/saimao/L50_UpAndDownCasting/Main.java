package it.saimao.L50_UpAndDownCasting;

public class Main {

    public static void main(String[] args) {
        Par par = new Child(); // Upcasting
        play(par);
        play(new Daughter());

    }

    public static void play(Par par) {
        if (par instanceof Child child) { // JDK 16 - switch pattern matching
            child.play();
        } else {
            System.out.println("Cannot play!");
        }
    }


}
