package com.company;

public class Main {

    public static void main(String[] args) {

    private static int getMinFromArray(int[] array){
        int indexOfMin = 0;

        for (int i = 1; i < array.length ; i++) {
            if (array[i]<array[indexOfMin]){
                indexOfMin = i;
            }

        }
        return array[indexOfMin];

    }
    }
}
