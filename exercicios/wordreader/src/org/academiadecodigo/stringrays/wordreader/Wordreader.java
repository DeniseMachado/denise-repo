package org.academiadecodigo.stringrays.wordreader;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;



public class Wordreader implements Iterable<String> {



    private String result = "";
    private String path;

    public Wordreader(String path) {
        this.path = path;
    }




    public String readFile() {

        String line = ".";



        try {

            FileReader reader = new FileReader(path);
            BufferedReader bReader = new BufferedReader(reader);



            while ((line = bReader.readLine()) != null) {
                result += line + "\n";
            }

            bReader.close();


        } catch (FileNotFoundException e) {
            System.out.println("File not found");


        } catch (IOException e) {
            e.printStackTrace();

        }
        //System.out.println(result);
        return result;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {


            String[] words = result.split(" ");
            int count = 0;


            @Override
            public boolean hasNext() {
                if (count < words.length) {

                    return true;
                }
                return false;
            }

            @Override
            public String next() {
                return words[count++];
            }
        };
    }


}


