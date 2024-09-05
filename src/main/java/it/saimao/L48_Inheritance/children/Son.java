package it.saimao.L48_Inheritance.children;

import it.saimao.L48_Inheritance.Parent;

// Child class or Sub class
public class Son extends Parent {

    public void printInfo() {
        System.out.println("Son company - " + company);
        System.out.println("Son Net income - " + netIncome);
    }

}
