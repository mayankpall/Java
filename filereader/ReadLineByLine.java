package com.bridgelabz.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;


        try {
            FileReader fileReader = new FileReader("/Users/mayankpal/Desktop/JAVA/javaclassroom/src/com/bridgelabz/filereader/ExampleFile.txt");
            bufferedReader = new BufferedReader(fileReader);

            String line ;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        }
        catch (Exception e){
                e.printStackTrace();
        }
        finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
