package org.academiadecodigo.stringrays.chat_server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class Server {
    public static void main(String[] args) {


        int portNumber = 8087;

        //String message = "Hello World";


        ServerSocket serverSocket;
        PrintWriter out;
        BufferedReader in;


        try {


            serverSocket = new ServerSocket(portNumber);
            System.out.println("Server is listening on port " + portNumber);


            Socket clientSocket = serverSocket.accept();
            System.out.println("New client connected. Waiting...");


            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            while (true) {

               // out.println(message);
                out.println(in.readLine());
            }

        } catch (UnknownHostException exception) {
            exception.getMessage();

        } catch (IOException exception) {
            exception.getMessage();

        }
    }
}





