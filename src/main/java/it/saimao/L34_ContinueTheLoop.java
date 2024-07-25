package it.saimao;

public class L34_ContinueTheLoop {
    public static void main(String[] args) {

        for (char ch = 'က', num = 1; ch <= 'အ'; ch++, num++) {
            if (ch == 'ဉ') continue;
            int i = num;
            System.out.print(i + " ");
            System.out.println(ch);
        }

    }
}
