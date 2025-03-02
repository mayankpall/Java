package com.bridgelabz.search.linearsearch;

public class FirstNegativeNumber {

    static int searchFirstNegativeIndex(int[] array){
        for(int index = 0; index < array.length; index++){
            if(array[index] < 0){
                return index;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 334 , 43, 23, 27, -2, -3, 5,-6};

        int foundIndex = searchFirstNegativeIndex(array);

        if(foundIndex == -1){
            System.out.println("No index found");
        }
        else {
            System.out.println("The first negative is at index : "+ foundIndex);
        }


    }
}
