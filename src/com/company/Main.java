package com.company;

public class Main {

    public static void main(int[] array) {


        int indexOfMax = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array[i]>array[indexOfMax]){
                indexOfMax = i;
            }

        }
        return array[indexOfMax];

    }

}
