package it.saimao.L66_Enumeration;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.printMonthName(100);

        Month month = Month.JAN;
        main.printMonthName(month);

    }

    private void printMonthName(int month) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        // 1 to 6
        if (month > 0 && month <= 6) {
            System.out.println(months[month - 1]);
        } else {
            System.out.println("Invalid input!");
        }
    }

    private void printMonthName(Month month) {
        System.out.println(month);
        System.out.println(month.fullName);
    }

}
