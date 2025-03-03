package com.bridgelabz.runtimeanalysis;

import java.io.*;

public class FileReadingPerformance {

    public static void main(String[] args) {
        try {
            File testDir = new File("test_files");
            if (!testDir.exists()) {
                testDir.mkdir();
            }

            String[] fileSizes = {"1MB", "10MB", "100MB"};
            int[] sizes = {1, 10, 100};

            for (int i = 0; i < fileSizes.length; i++) {
                String fileName = "test_files/test_file_" + fileSizes[i] + ".txt";
                File file = new File(fileName);

                if (!file.exists()) {
                    System.out.println("Generating test file: " + fileName);
                    generateTestFile(file, sizes[i]);
                }

                System.out.println("File Size: " + fileSizes[i]);


                long startTime = System.nanoTime();
                int charactersRead = readWithFileReader(file);
                long fileReaderTime = System.nanoTime() - startTime;
                System.out.println("FileReader time: " + fileReaderTime / 1_000_000.0 + " ms");
                System.out.println("Characters read: " + charactersRead);


                startTime = System.nanoTime();
                charactersRead = readWithInputStreamReader(file);
                long inputStreamReaderTime = System.nanoTime() - startTime;
                System.out.println("InputStreamReader time: " + inputStreamReaderTime / 1_000_000.0 + " ms");
                System.out.println("Characters read: " + charactersRead);


                startTime = System.nanoTime();
                charactersRead = readWithBufferedFileReader(file);
                long bufferedFileReaderTime = System.nanoTime() - startTime;
                System.out.println("BufferedReader with FileReader time: " + bufferedFileReaderTime / 1_000_000.0 + " ms");
                System.out.println("Characters read: " + charactersRead);


                startTime = System.nanoTime();
                charactersRead = readWithBufferedInputStreamReader(file);
                long bufferedInputStreamReaderTime = System.nanoTime() - startTime;
                System.out.println("BufferedReader with InputStreamReader time: " + bufferedInputStreamReaderTime / 1_000_000.0 + " ms");
                System.out.println("Characters read: " + charactersRead);

                System.out.println("------------------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateTestFile(File file, int sizeInMB) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            long characters = sizeInMB * 1024 * 1024;
            char[] buffer = new char[1024];


            for (int i = 0; i < buffer.length; i++) {
                buffer[i] = (char) ('a' + (i % 26));
            }

            long written = 0;
            while (written < characters) {
                writer.write(buffer);
                written += buffer.length;
            }
        }
    }

    private static int readWithFileReader(File file) throws IOException {
        int charactersRead = 0;
        try (FileReader reader = new FileReader(file)) {
            int c;
            while ((c = reader.read()) != -1) {
                charactersRead++;
            }
        }
        return charactersRead;
    }

    private static int readWithInputStreamReader(File file) throws IOException {
        int charactersRead = 0;
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(file))) {
            int c;
            while ((c = reader.read()) != -1) {
                charactersRead++;
            }
        }
        return charactersRead;
    }

    private static int readWithBufferedFileReader(File file) throws IOException {
        int charactersRead = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int c;
            while ((c = reader.read()) != -1) {
                charactersRead++;
            }
        }
        return charactersRead;
    }

    private static int readWithBufferedInputStreamReader(File file) throws IOException {
        int charactersRead = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            int c;
            while ((c = reader.read()) != -1) {
                charactersRead++;
            }
        }
        return charactersRead;
    }
}