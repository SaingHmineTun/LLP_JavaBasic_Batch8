package it.saimao.L95_FileHandling;

import java.io.*;

/*
Read => BufferedReader
Write => BufferedWriter
 */
public class L95_ReadFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine(); // Read the first line
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(file.getAbsoluteFile() + " cannot not be found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
