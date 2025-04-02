package com.bridgelabz.collections.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsAreEqual {

    static <T> boolean checkIfEqual(Set<T> setOne, Set<T> setTwo){
        return setTwo.equals(setOne);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> setOne = new HashSet<>();
        HashSet<Integer> setTwo = new HashSet<>();

        System.out.println("Enter Number of values you want to insert for set 1 :");
        int n = scanner.nextInt();
        System.out.println("Enter Values");

        for (int i = 0; i < n; i++){
            int data = scanner.nextInt();
            setOne.add(data);
        }

        System.out.println("Enter Number of values you want to insert for set 2 :");
        int m = scanner.nextInt();
        System.out.println("Enter Values");

        for (int i = 0; i < m; i++){
            int data = scanner.nextInt();
            setTwo.add(data);
        }

        scanner.close();

        if(n != m){
            System.out.println("Not Equal");

        }
        else {
            System.out.println(checkIfEqual(setOne,setTwo) ? "Both set have same elements ": "NOt equal");
        }


    }
}
