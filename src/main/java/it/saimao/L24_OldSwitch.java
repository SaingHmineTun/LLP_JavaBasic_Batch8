package it.saimao;

public class L24_OldSwitch {

    public static void main(String[] args) {

        int i = 3;
        switch (i) {
            case 1, 2, 3, 4:
                System.out.println("Primary school department");
                break;
            case 5, 6, 7, 8:
                System.out.println("Middle school department");
                break;
            case 9, 10:
                System.out.println("High school department");
                break;
            default:
                System.out.println("Go to head master's office");
        }

    }

}
