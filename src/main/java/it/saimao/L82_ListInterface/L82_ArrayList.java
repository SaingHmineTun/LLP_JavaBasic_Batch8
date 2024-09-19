package it.saimao.L82_ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class L82_ArrayList {

    /*
    CRUD - Create, Read, Update, Delete
     */
    public static void main(String[] args) {

        // Create a list
        List<String> list = new ArrayList<>();


        // Add elements into list
        list.add("naruto");
        list.add("sasuke");
        list.add("sakura");
        list.add("shino");
        list.add("hinata");
        list.add("rock lee");
        list.add(2, "ino");
        list.addFirst("pain");

        // {"naruto", "sasuke", "sakura"}

        System.out.println("Size of list : " + list.size());

        // Get element from list
        String index0 = list.getFirst();
        String indexLast = list.getLast();
        System.out.println("Index 0 - " + index0);
        System.out.println("Index 2 - " + list.get(2));
        System.out.println("Index last - " + indexLast);

        // Update element in list
        System.out.println("Before update of index 3 - " + list.get(3));
        list.set(3, "Sarada");
        System.out.println("After update of index 3 - " + list.get(3));

        // Remove element from list
        System.out.println("Before remove : " + list.size()); // 8
        String removedElement = list.remove(5);
        boolean isRemoved = list.remove("boruto");
        System.out.println("After remove: " + list.size() + " " + removedElement + " " + isRemoved); // TRUE 6 : FALSE 7

        // IndexOf
        System.out.println("Index of INO - " + list.indexOf("Sarada"));

        list.forEach(s -> System.out.println(s));
    }

}
