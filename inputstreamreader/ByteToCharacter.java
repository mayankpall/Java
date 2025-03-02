package com.bridgelabz.inputstreamreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ByteToCharacter {
    public static void main(String[] args) {
        String filePath = "/Users/mayankpal/Desktop/JAVA/javaclassroom/src/com/bridgelabz/inputstreamreader/example.bin";

        try(FileInputStream fileInputStream = new FileInputStream(filePath)) {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bfr = new BufferedReader(inputStreamReader);

            String line ;
            while ((line = bfr.readLine()) != null){
                System.out.println(line);
            }


        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
