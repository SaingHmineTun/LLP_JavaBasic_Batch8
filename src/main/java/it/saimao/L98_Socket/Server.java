package it.saimao.L98_Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        /*
        Host number -> 192.168.100.17
        Port number -> 5432
        If get socket, you also get input stream and output stream!
         */
        try {
            ServerSocket serverSocket = new ServerSocket(5432);
            System.out.println("Server running at port 5432...");
            Socket socket = serverSocket.accept();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("Hello client, I'm sender. Nice to see you!");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
