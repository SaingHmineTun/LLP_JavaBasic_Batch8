package it.saimao.L82_ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

public class L83_Vector {

    /*
    CRUD - Create, Read, Update, Delete
     */
    public static void main(String[] args) {

        // Create a list
        Vector<String> list = new Vector<>();


        // Add elements into list
        list.addElement("naruto");
        list.add("sasuke");
        list.add("sakura");
        list.add("shino");
        list.add("hinata");
        list.add("rock lee");
        list.insertElementAt("ino", 2);
        list.addFirst("pain");

        // {"naruto", "sasuke", "sakura"}

        System.out.println("Size of list : " + list.size());

        // Get element from list
        String index0 = list.getFirst();
        String indexLast = list.getLast();
        System.out.println("Index 0 - " + index0);
        System.out.println("Index 2 - " + list.elementAt(2));
        System.out.println("Index last - " + indexLast);

        // Update element in list
        System.out.println("Before update of index 3 - " + list.get(3));
        list.set(3, "Sarada");
        System.out.println("After update of index 3 - " + list.get(3));

        // Remove element from list
        System.out.println("Before remove : " + list.size()); // 8
        list.removeElementAt(5);
        boolean isRemoved = list.removeElement("boruto");
        System.out.println("After remove: " + list.size() + " " + isRemoved); // TRUE 6 : FALSE 7

        // IndexOf
        System.out.println("Index of INO - " + list.indexOf("Sarada"));

        var elements = list.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }
    }

}
