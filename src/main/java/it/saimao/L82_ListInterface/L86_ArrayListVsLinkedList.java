package it.saimao.L82_ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/*
ArrayList
addFirst - 4203
addLast - 27

getFirst -

LinkedList
addFirst - 47
addLast - 54

getFirst - 0
getLast - 0
 */
public class L86_ArrayListVsLinkedList {
    public static void main(String[] args) {

        var list = new ArrayList<Integer>();
        var rd = new Random();

        for (int i = 0; i < 100_000; i++) {
            list.addLast(rd.nextInt());
        }

        long start = System.currentTimeMillis();
        list.getFirst();
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Duration : " + duration);
    }
}
