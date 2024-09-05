package it.saimao.L48_Inheritance;

// Super class or Parent class
public class Parent {
    protected String company = "Shwe War Co Ltd";
    protected int netIncome = 123_456_789;

    public void printInfo() {
        System.out.println("Parent Company: " + company);
        System.out.println("Parent Net Income: " + netIncome);
    }
}
