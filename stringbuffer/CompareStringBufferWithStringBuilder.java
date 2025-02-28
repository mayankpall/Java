package com.bridgelabz.stringbuffer;

public class CompareStringBufferWithStringBuilder {


        public static void main(String[] args) {
            int iterations = 1_000_000;
            String str = "hello";


            long startTimeBuffer = System.nanoTime();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < iterations; i++) {
                stringBuffer.append(str);
            }
            long endTimeBuffer = System.nanoTime();
            long timeTakenBuffer = endTimeBuffer - startTimeBuffer;


            long startTimeBuilder = System.nanoTime();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < iterations; i++) {
                stringBuilder.append(str);
            }
            long endTimeBuilder = System.nanoTime();
            long timeTakenBuilder = endTimeBuilder - startTimeBuilder;


            System.out.println("Time taken by StringBuffer: " + timeTakenBuffer + " nanoseconds");
            System.out.println("Time taken by StringBuilder: " + timeTakenBuilder + " nanoseconds");


            if (timeTakenBuffer < timeTakenBuilder) {
                System.out.println("StringBuffer is faster.");
            } else if (timeTakenBuffer > timeTakenBuilder) {
                System.out.println("StringBuilder is faster.");
            } else {
                System.out.println("Both StringBuffer and StringBuilder took the same time.");
            }
        }


}
