package it.saimao.L95_FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L97_ReadFileWithScanner {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
