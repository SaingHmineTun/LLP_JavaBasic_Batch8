package it.saimao.L65_ObjectEquality;

public class Main {
    public static void main(String[] args) {

        Bag bag = new Bag("LV", 12000, 'r');
        Bag bag1 = new Bag("LV", 1000, 'r');
        Bag bag3 = bag;
        System.out.println(bag.equals(bag1));
    }
}
