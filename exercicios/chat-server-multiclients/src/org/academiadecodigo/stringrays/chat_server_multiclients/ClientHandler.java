package org.academiadecodigo.stringrays.chat_server_multiclients;

import java.io.BufferedReader;
import java.net.Socket;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientHandler implements Runnable {


    private Socket clientSocket;
    //private ServerSocket serverSocket;


    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;

    }

    @Override
    public void run() {
        processClientRequest(clientSocket);

    }

    private void processClientRequest(Socket clientSocket) {
        try {

            while (true) {


                BufferedReader fromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                //get first line from the client
                String line = fromClient.readLine();

                if (line == null) {
                    return;
                }

                System.out.println(line);
            }

        } catch (IOException ex) {
            ex.printStackTrace();

        } finally {
            close(clientSocket);
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

