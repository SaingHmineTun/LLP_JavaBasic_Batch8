package it.saimao;

public class L23_If_ConditionalStatement {
    public static void main(String[] args) {

        int studentGrade = 9;
        if (studentGrade >= 1 && studentGrade < 5) {
            System.out.println("Go to primary school department");
        } else if (studentGrade == 5) {
            System.out.println("Go to middle school department");
        } else if (studentGrade == 6) {
            System.out.println("Go to middle school department");
        } else if (studentGrade == 7) {
            System.out.println("Go to middle school department");
        } else if (studentGrade == 8) {
            System.out.println("Go to middle school department");
        } else {
            System.out.println("Go to head master office");
        }
    }
}
