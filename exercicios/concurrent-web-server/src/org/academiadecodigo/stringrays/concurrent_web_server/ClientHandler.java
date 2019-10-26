package org.academiadecodigo.stringrays.concurrent_web_server;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private Socket clientSocket;

    private String resourcesRoot = "resources";
    private String notFound = "/404.html";


    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }


    @Override
    public void run() {
        processClientRequest(clientSocket);
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
