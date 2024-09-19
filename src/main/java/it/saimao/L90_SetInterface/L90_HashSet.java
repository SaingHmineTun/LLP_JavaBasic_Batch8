package it.saimao.L90_SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

// NO ORDER
public class L90_HashSet {
    public static void main(String[] args) {

        // Creating a set
        Set<String> set = new HashSet<String>();

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

        for(String fruit: set) {
            System.out.println(fruit);
        }



    }
}
