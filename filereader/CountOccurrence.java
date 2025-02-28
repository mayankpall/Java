package com.bridgelabz.filereader;


import java.io.BufferedReader;
import java.io.FileReader;

public class CountOccurrence {
    public static void main(String[] args) {
        String filePath = "/Users/mayankpal/Desktop/JAVA/javaclassroom/src/com/bridgelabz/filereader/ExampleFile.txt";
        String target = "Mayank";
        int count = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null){
                String[] words = line.split("\\s+");
                for(String word : words ){
                    if(word.equals(target)){
                        count++;
                    }
                }
            }

            System.out.println("Total count of target "+ target+" is " + count);

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
