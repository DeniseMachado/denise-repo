package org.academiadecodigo.stringrays.copy_file;

import java.io.*;


public class CopyFile {

    public FileInputStream in;
    public FileOutputStream out;
    public String myFile;
    public String newFile;

    public CopyFile(String myFile, String newFile) {
        this.myFile = myFile;
        this.newFile = newFile;
    }


    public void copy() {

        try {
            in = new FileInputStream("myFile"); // O meu inputStream está a instanciar um novo fileInputStrem que recebe o ficheiro para ler
            byte[] buffer = new byte[1024];
            int lenght = in.read(buffer); //Vai ler quantos bytes tem o ficheiro
            System.out.println(lenght); //Estou a imprimir o numero de bites do meu ficheiro
            in.close(); //Sempre que abrimos um input tempos de fechar.

            out = new FileOutputStream(newFile); //Para escrever é o output, então vou instanciar um novo fileOutput que recebe o meu novo file
            out.write(buffer, 0, lenght); //Recebe o buffer, off é o núero inicial de bytes e o numero total de bytes do mue ficheiro.
            out.close();//Fechar

        } catch (IOException e) {
            System.out.println(e.getMessage());

            cleanUp();

            System.exit(1);

        } finally {
            cleanUp();
        }

    }

    public void cleanUp() {
        try {

            if (in != null) {
                in.close();
            }

            if (out != null) {
                out.close();
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
