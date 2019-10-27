package org.academiadecodigo.stringrays.chat_improvement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

    public static void main(String[] args) {


        String hostName = "localHost";
        String userInput;
        int portNumber = 8087;

        Socket clientSocket = null;
        BufferedReader in;
        BufferedReader inputClientScanner;
        PrintWriter out;


        try {

            clientSocket = new Socket(hostName, portNumber);

            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            inputClientScanner = new BufferedReader((new InputStreamReader(System.in)));

            while (true) {
                userInput = inputClientScanner.readLine();

                out.println(userInput);
                System.out.println("Client: " + in.readLine());
            }

        } catch (UnknownHostException exception) {
            exception.getMessage();
        } catch (IOException exception) {
            exception.getMessage();

        } finally {
            if(clientSocket != null) {

                try {
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
