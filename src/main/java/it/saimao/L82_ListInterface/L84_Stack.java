package it.saimao.L82_ListInterface;

import java.util.Stack;
import java.util.Vector;

public class L84_Stack {

    /*
    CRUD - Create, Read, Update, Delete
     */

    /*
    push = addLast()
    peek = getLast()
    pop = getLast() then removeLast()
     */
    public static void main(String[] args) {

        // Create a list
        Stack<String> list = new Stack<>();


        // Add elements into list
        list.addElement("naruto");
        list.add("sasuke");
        list.add("sakura");
        list.add("shino");
        list.add("hinata");
        list.add("rock lee");
        list.insertElementAt("ino", 2);
        list.push("pain");

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

        System.out.println("######################");
        for (String s : list.reversed()) {
            System.out.println(s);
        }
        System.out.println("#################");

        System.out.println("pain _ " + list.indexOf("pain" ) + " : " + list.search("pain"));
        System.out.println("naruto _ " + list.indexOf("naruto" ) + " : " + list.search("naruto"));

    }

}
