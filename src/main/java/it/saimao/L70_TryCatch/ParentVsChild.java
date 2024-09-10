package it.saimao.L70_TryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
1) Generic class (parent class)
2) Specific class (child class)
 */
public class ParentVsChild {
    public static void main(String[] args) {
        File file = new File("asdf");
        String name = "null";

        try {
            name.toString(); // Unchecked (NullPointer)
            FileReader fr = new FileReader(file); // Checked (FileNotFound)
        } catch (NullPointerException e) {
            System.out.println("Name is null");
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found!");
        }
        System.out.println("Main end!");
    }
}
