package com.company;

public class Main {

    public static void main(String[] args) {

    int [] temperatures = new int [5];

        for (int i = 0; i < 5; ++i){
            temperatures[i] = i;
        }

        for (int i = 0; i < 5; ++i) {
            System.out.println(temperatures[i]);

        }

        // printarrayelements(temperatures);
        // populatearray(temperatures);
        // printmaxvalue(temperatures);

        // UserOperation userOperation = new UserOperation();

        //userOperation.printUserArray(userOperation.generateUserArray(10));





    }

    private static void countAVG(int[] array){

        
        System.out.println("AVG: ");
    }

    private static void printArrayElements(int[] array) {

    }
    private static void populateArray(int[] array){
        for (int i = 0; i < array.length; ++i) {
            array[i] = i;
    }
    }
    private static void printMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; ++i){
            if (arr[i] > max){
                max = arr[i];
            }
        }
    }
}
