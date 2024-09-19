package it.saimao.L98_Socket;

import org.xml.sax.InputSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/*
        Host number -> 192.168.100.17
        Port number -> 5432
        If get socket, you also get input stream and output stream!
         */
public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("192.168.100.17", 5432);
        InputStream is = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
        is.close();
    }
}
/*
Deadline (25, 9, 2024)
Final project for Certificate (Chat app)
1) Socket
2) Thread


Optional project (Note app)
1) File
var location = "";
1) Read
2) Write
3) Exit
 */
