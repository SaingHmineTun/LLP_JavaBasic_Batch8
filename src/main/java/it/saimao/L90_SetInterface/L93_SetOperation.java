package it.saimao.L90_SetInterface;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class L93_SetOperation {
    public static void main(String[] args) {
        Set<String> fruits1 = new LinkedHashSet<>(Set.of("apple", "orange", "banana")); // Immutable => Mutable
        fruits1.add("cherry");

        List<String> fruits2 = new ArrayList<>(List.of("potato", "tomato", "apple"));

        // UNION (addAll)
//        fruits1.addAll(fruits2); // f1 U f2
//        fruits1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        // INTERSECTION (retainAll)
//        fruits1.retainAll(fruits2); // f1 n f2
//        System.out.println(fruits1);

        // DIFFERENCE (removeAll)
        fruits1.removeAll(fruits2);
        System.out.println(fruits1);

    }
}
