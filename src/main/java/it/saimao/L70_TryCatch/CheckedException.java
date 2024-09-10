package it.saimao.L70_TryCatch;

import java.io.File;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) {

        File file = new File("pome.xml");
        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("Read success!");
        } catch (Exception e) {
            System.out.println("Cannot read asdf.txt file");
        }
        System.out.println("END MAIN!");

    }

}
