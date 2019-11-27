package org.academiadecodigo.stringrays;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        MyPojo myPojo = null;




        try {

            myPojo = mapper.readValue(new URL("http://ipinfo.io/json"), MyPojo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(myPojo);


    }
}
