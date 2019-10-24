package org.academiadecodigo.stringrays.web_server;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;

public class HeaderProcessor {

    private HeaderProcessor() {
        //don't allow objects of this type
    }

    public static String parseVerb(String httpRequest) {
        return httpRequest.split(" ")[0];

    }

    public static String parseResource(String httpRequest) {
        return httpRequest.split(" ")[1];

    }

    public static void sendUnsupported(OutputStream toClient) throws IOException {
        String header = "HTTP/1.0 405 METHOD NOT SUPPORTED\r\n" +
                "Allowed-Verbs: GET\r\n" +
                "\r\n";

        toClient.write(header.getBytes());

    }

    public static void sendNotFound(OutputStream toClient, long fileSize) throws IOException {
        String header = "HTTP/1.0 404 NOT FOUND\r\n" +
                "Content Type: text/html; charset= UTG\r\n" +
                "Content lenght:" + fileSize + "\r\n" +
                "\r\n";
        toClient.write(header.getBytes());
    }

    public static void sendOk(OutputStream toClient, File file) throws IOException {
        String secondLine = "Content-type" + Files.probeContentType(file.toPath());

        if (Files.probeContentType(file.toPath()).equals("text/html")) {
            secondLine += "; charset=UTF-8\r\n";
        } else {
            secondLine += ";\r\n";
        }

        String header = "HTTP/1.0 200 Document Follows\r\n" +
               secondLine + "; charset= UTG\r\n" +
                "Content lenght:" + file.length() + "\r\n" +
                "\r\n";

        toClient.write(header.getBytes());

    }
}
