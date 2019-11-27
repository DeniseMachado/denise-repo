package org.academiadecodigo.stringrays.chat_server_multiclients;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

    private static final int PORT_NUMBER = 8090;
    private static final String HOST_NAME = "localhost";

    public static void main(String[] args) {

        try {
            Socket clientSocket = new Socket(HOST_NAME, PORT_NUMBER);

            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedReader inputClientScanner = new BufferedReader((new InputStreamReader(System.in)));

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);


            while (true) {
                System.out.println("New client: ");
                String message = inputClientScanner.readLine();


                out.println(message);
                System.out.println(input.readLine());
            }

        } catch (UnknownHostException exception) {
            exception.getMessage();
        } catch (IOException exception) {
            exception.getMessage();


        }
    }

}
