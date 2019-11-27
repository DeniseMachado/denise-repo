package org.academiadecodigo.stringrays.chat_server_multiclients;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TCPServer {

    public static void main(String[] args) {

        TCPServer server = new TCPServer();
        server.start();

    }


    private static final int PORT_NUMBER = 8090;
    private Socket clientSocket;

    private static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(4);

    ServerSocket serverSocket = null;


    public void start() {

        try {

            serverSocket = new ServerSocket(PORT_NUMBER);
            System.out.println("Server is listening on port " + PORT_NUMBER);


            while (true) {
                clientSocket = serverSocket.accept();
                System.out.println("New client connected. Waiting...");

                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                out.println(in.readLine());

                ClientHandler newClientHandler = new ClientHandler(clientSocket);

                clientHandlers.add(newClientHandler);
                pool.execute(newClientHandler);


            }

        } catch (IOException ex) {
            System.out.println("Server Connection error: " + ex.getMessage());

        } finally {
            close(clientSocket);
            close(serverSocket);
        }
    }

    private void close(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }

        } catch (IOException ignored) {
            System.err.println("Error while closing the " + closeable.getClass().getSimpleName());
        }

    }

}

