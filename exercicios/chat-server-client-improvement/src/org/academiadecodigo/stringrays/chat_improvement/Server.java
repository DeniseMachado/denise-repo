package org.academiadecodigo.stringrays.chat_improvement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
    public static void main(String[] args) {


        int portNumber = 8087;


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





