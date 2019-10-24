package org.academiadecodigo.stringrays.copy_file;

import java.io.*;


public class CopyFile {

    public FileInputStream inputStream;
    public FileOutputStream outputStream;
    public String myFile;
    public String newFile;

    public CopyFile(String myFile, String newFile) {
        this.myFile = myFile;
        this.newFile = newFile;
    }


    public void copy() {

        try { //Atira-me uma excepção, então vou lidar com ela dentro do método
            inputStream = new FileInputStream("myFile"); // O meu inputStream está a instanciar um novo fileInputStrem que recebe o ficheiro para ler
            byte[] buffer = new byte[1024];
            int lenght = inputStream.read(buffer); //Vai ler quantos bytes tem o ficheiro
            System.out.println(lenght); //Estou a imprimir o numero de bites do meu ficheiro
            inputStream.close(); //Sempre que abrimos um input tempos de fechar.

            outputStream = new FileOutputStream(newFile); //Para escrever é o output, então vou instanciar um novo fileOutput que recebe o meu novo file
            outputStream.write(buffer, 0, lenght); //Recebe o buffer, off é o núero inicial de bytes e o numero total de bytes do mue ficheiro.
            outputStream.close();//Fechar

        } catch (IOException e) {
            e.printStackTrace(); //este método ajuda a identificar qual método causa um bug no programa
        }

        //finally {
        // try {
    //} catch

    }
}
