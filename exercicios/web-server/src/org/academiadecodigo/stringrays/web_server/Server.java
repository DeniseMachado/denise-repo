package org.academiadecodigo.stringrays.web_server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;

public class Server {


    private int portNumber;

    private Socket clientSocket;
    private String resourcesRoot = "resources";
    private String notFound = "/404.html";

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

                processClientRequest(clientSocket);

            }

        } catch (IOException exception) {
            System.out.println("Server Connection error: " + exception.getMessage());

        }

    }


    private void processClientRequest(Socket socket) {


        try {

            BufferedReader fromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //get first line from the client
            String line = fromClient.readLine();


            if (line == null) {
                return;
            }

            System.out.println(line);

            String verb = HeaderProcessor.parseVerb(line);
            String resource = HeaderProcessor.parseResource(line);


            if (!verb.equals("GET")) {
                HeaderProcessor.sendUnsupported(socket.getOutputStream());
                return;

            }
            //Problems here
            if (resource.equals("/")) {
                resource += "index.html";
            }


            File file = new File(resourcesRoot + resource);

            if (file.isDirectory()) {
                resource += "/index.html";
                file = new File(resourcesRoot + resource);
            }

            if (!file.exists() || !file.isFile() || file.getPath().contains("META-INF")) {
                file = new File("META-INF" + notFound);
                HeaderProcessor.sendNotFound(socket.getOutputStream(), file.length());
                FileCopy.copyTo(socket.getOutputStream(), file);
                return;

            }

            HeaderProcessor.sendOk(socket.getOutputStream(), file);
            FileCopy.copyTo(socket.getOutputStream(), file);


        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            close(socket);

        }
    }



   /* public byte[] convertToBytes(File file) {
        byte[] newFile = new byte[(int) file.length()];
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);
            inputStream.read(newFile);

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();

        } catch (IOException exception) {
            exception.getMessage();

        } finally {
            if (inputStream != null) {
                close(inputStream);
            }
        }

        return newFile;

    }*/


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



