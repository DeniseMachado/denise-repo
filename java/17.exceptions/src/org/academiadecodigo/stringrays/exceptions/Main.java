package org.academiadecodigo.stringrays.exceptions;

import org.academiadecodigo.stringrays.exceptions.exceptions.FileNotFoundException;
import org.academiadecodigo.stringrays.exceptions.exceptions.NotEnoughPermissionsException;
import org.academiadecodigo.stringrays.exceptions.exceptions.NotEnoughSpaceExceptions;

public class Main {

    public static void main(String[] args) {



        FileManager fileManager = new FileManager(100);


        try {

            fileManager.logout();
        } catch (NotEnoughPermissionsException message) {
            System.out.println(message.getMessage());
        }

        try {
            fileManager.getFile("file3");
        } catch (NotEnoughPermissionsException message) {
            System.out.println(message.getMessage());
        } catch (FileNotFoundException message) {
            System.out.println(message.getMessage());
        }


        try {
            fileManager.createFile("FileFile");
        } catch (NotEnoughSpaceExceptions exception) {
            System.out.println(exception.getMessage());
        }
    }
}
