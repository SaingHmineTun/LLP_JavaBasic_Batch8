package it.saimao.L87_MapInterface;

import java.util.Map;
import java.util.TreeMap;

// ASCENDING (ALPHABET) ORDER
public class L89_TreeMap {
    public static void main(String[] args) {

        // Creating a map
        Map<String, Integer> map = new TreeMap<>();

        // Adding value into map
        map.put("apple", 500);
        map.put("orange", 450);
        map.put("mango", 700);
        map.put("avocado", 1000);
        map.put("guava", 200);
        map.put("pepper", 20);
        map.put("banana", 350);
        map.putIfAbsent("apple", 700);

        // Get value from map
        System.out.println(map.get("apple"));

        // Remove element in map
        System.out.println("Before remove banana - " + map.get("banana"));
        map.remove("banana", 300);
        System.out.println("Before remove banana - " + map.getOrDefault("banana", 0));

        // Update element
        System.out.println("Before update guava price - " + map.get("guava"));
        map.replace("guava", 250);
        System.out.println("After update guava price - " + map.get("guava"));

        // Loop map
        System.out.println("########################");
//        map.forEach((key, value) -> {
//            System.out.println(key + " : " + value);
//        });

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        for (String string : map.keySet()) {
            System.out.println(string + " : " + map.get(string));
        }

        L89_TreeMap l87HashMap = new L89_TreeMap();
        System.out.println(l87HashMap.hashCode());

        System.out.println("###########################");
    }
}
