package org.academiadecodigo.stringrays.url_source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Url {
    public static void main(String[] args) {

        URL url;
        URLConnection connection;
        BufferedReader bufferedReader;


        try {

            url = new URL("https://applyto.academiadecodigo.org/");

            /**
             * Returns a URLConnection instance that represents a connection to the remote object
             * referred to by the URL.
             */
            connection = url.openConnection();
            bufferedReader = new BufferedReader(new
                    InputStreamReader(connection.getInputStream()));

            /**
             * To read all text, not only the first line
             */
            String string;

            while ((string = bufferedReader.readLine()) != null) {
                System.out.println(string);
            }
            bufferedReader.close();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
