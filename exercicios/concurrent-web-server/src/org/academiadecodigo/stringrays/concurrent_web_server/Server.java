package org.academiadecodigo.stringrays.concurrent_web_server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private int portNumber;

    private Socket clientSocket;


    ServerSocket serverSocket = null;


    public Server(int portNumber) {
        this.portNumber = portNumber;
    }

    public void start() {


        try {
            serverSocket = new ServerSocket(portNumber);

            while (true) {
                clientSocket = serverSocket.accept();
                System.out.println("Server is listening on port... " + portNumber);

                new Thread(new ClientHandler(clientSocket)).start();


            }

        } catch (IOException exception) {
            System.out.println("Server Connection error: " + exception.getMessage());

        }

    }




}

