package com.bridgelabz.search.linearsearch;

import java.util.Arrays;

public class SearchWord {

    static void searchWord(String[] array, String target){

        for(String line : array){
            if(line.contains(target)){
                System.out.println(line);
                return;
            }
        }

        System.out.println("Not Found");

    }

    public static void main(String[] args) {
        String[] sentences = {
                "Mayank Pal , Arnav, Vibhor, Kanika",
                "Java is a widely used programming language.",
                "The quick brown fox jumps over the lazy dog.",
                "Data structures and algorithms are important."
        };

        String target = "quick";

        searchWord(sentences, target);


    }
}
