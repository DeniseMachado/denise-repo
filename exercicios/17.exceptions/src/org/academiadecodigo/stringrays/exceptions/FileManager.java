package org.academiadecodigo.stringrays.exceptions;

import org.academiadecodigo.stringrays.exceptions.exceptions.FileNotFoundException;
import org.academiadecodigo.stringrays.exceptions.exceptions.NotEnoughPermissionsException;
import org.academiadecodigo.stringrays.exceptions.exceptions.NotEnoughSpaceExceptions;

public class FileManager {

    private boolean authentication;
    private File[] files;
    private int fileCounter = 0; //avoid countinously iterating over the files array

    public FileManager(int fileQuantity) {
        this.files = new File[fileQuantity];
        authentication = false;
    }


    public void login() {
        authentication = true;

    }

    public void logout() throws NotEnoughPermissionsException {
        if (!authentication) {
            throw new NotEnoughPermissionsException("Login first!!!");
        }
        authentication = false;
    }


    public File[] getFile(String file) throws FileNotFoundException, NotEnoughPermissionsException {

        if (!authentication) {
            throw new NotEnoughPermissionsException("Login before get file");
        }
        if (this.files.toString() != file) {
            throw new FileNotFoundException("File not found!");
        }
        return this.files;


    }

    public void createFile(String fileName) throws NotEnoughSpaceExceptions {


        for (int i = 0; i < files.length; i++) {
            if (files[i] != null && files[i].getName().equals(fileName)) {
                System.out.println("ff");
                throw new NotEnoughSpaceExceptions("Not enought space");

            }

        }

        files = new File[0];


    }
}
