package it.saimao.L95_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class L96_WriteFile {
    public static void main(String[] args) {

        File file = new File("test.txt");
        // Try - with - resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Hello, world");
            writer.newLine();
            writer.write("How are you?");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
