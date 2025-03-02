package com.bridgelabz.inputstreamreader;

import java.io.*;

public class WriteUsingUserInput {
    public static void main(String[] args) {
        String filePath  = "/Users/mayankpal/Desktop/JAVA/javaclassroom/src/com/bridgelabz/inputstreamreader/userinput.txt";

        try(
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                FileWriter fileWriter = new FileWriter(filePath);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                )
        {
            System.out.println("Enter text 'exit' to stop:");

            String line ;
            while (true){
                line = bufferedReader.readLine();
                if(line.equals("exit")){
                    break;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();

            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
