package org.academiadecodigo.stringrays.copy_file;

import java.io.File;


public class Main {

    public static void main(String[] args) {

        CopyFile copyFile = new CopyFile("myFile", "newFile");

        copyFile.copy();
    }


}
