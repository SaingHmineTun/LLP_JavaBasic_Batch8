package it.saimao.L38_Methods;

public class Computer {
    String brand = "Lenovo";
    int ram = 8;
    boolean active = true;

    /*
    void => No return type
    openIntelliJ => method name
    () => No parameters
     */
    void openIntelliJ() {
        char c = 'c';
        System.out.println("Search for intellij");
        System.out.println("Click on its icon");
        System.out.println("Wait for it to open!");
    }

    void continueTheLoop() {
        for (char ch = 'က', num = 1; ch <= 'အ'; ch++, num++) {
            if (ch == 'ဉ') continue;
            int i = num;
            System.out.print(i + " ");
            System.out.println(ch);
        }
    }

    void printInfo() {
        System.out.printf("Brand - %s%nRam - %d%nActive - %b%n", brand, ram, active);
    }


}
