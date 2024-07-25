package it.saimao;

public class L33_BreakTheLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
            if (i == 50)
                break;
        }
        System.out.println("End of loop");
    }
}
