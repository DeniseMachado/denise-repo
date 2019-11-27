package org.academiadecodigo.stringrays.concurrent_web_server;


import java.io.*;

public class FileCopy {

    private FileCopy() {
        //dont allow instances of this class to be created
    }

    public static void copyTo(OutputStream stream, File file) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(file);

        fileInputStream.transferTo(stream);

    }
}

