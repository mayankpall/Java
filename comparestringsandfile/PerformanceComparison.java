package com.bridgelabz.comparestringsandfile;

import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        compareStringBuilderAndStringBuffer();
        compareFileReaderAndInputStreamReader("example.txt");
    }


    public static void compareStringBuilderAndStringBuffer() {
        int iterations = 1_000_000;
        String text = "hello";


        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ms");


        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ms");
    }


    public static void compareFileReaderAndInputStreamReader(String filePath) {
        long startTime, endTime;


        startTime = System.currentTimeMillis();
        int wordCount1 = countWordsUsingFileReader(filePath);
        endTime = System.currentTimeMillis();
        System.out.println("FileReader Word Count: " + wordCount1 + ", Time: " + (endTime - startTime) + " ms");


        startTime = System.currentTimeMillis();
        int wordCount2 = countWordsUsingInputStreamReader(filePath);
        endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Word Count: " + wordCount2 + ", Time: " + (endTime - startTime) + " ms");
    }


    public static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }


    public static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }
}
