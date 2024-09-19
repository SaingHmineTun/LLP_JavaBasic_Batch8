package it.saimao.L90_SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// INSERTION ORDER
public class L92_TreeSet {
    public static void main(String[] args) {

        // Creating a set
        Set<String> set = new TreeSet<>();

        //  Adding elements into set
        set.add("apple");
        set.add("orange");
        set.add("banana");
        set.add("strawberry");
        set.add("cherry");
        set.add("potato");
        set.add("tomato");

        // Removing element from set
        set.remove("tomato");

        for (String fruit : set) {
            System.out.println(fruit);
        }


    }
}
