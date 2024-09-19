package it.saimao.L90_SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// INSERTION ORDER
public class L91_LinkedHastSet {
    public static void main(String[] args) {

        // Creating a set
        Set<String> set = new LinkedHashSet<>();

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
