package com.akilesh;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getIntegers(6);
        printArray(array);

        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);

        scanner.close();
    }

    public static int[] getIntegers(int numberOfIntegers) {
        System.out.println("Enter " + numberOfIntegers + " integers.\r");
        int[] array = new int[numberOfIntegers];
        for (int i = 0; i < array.length; i++) {
            int readInt = scanner.nextInt();
            array[i] = readInt;
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];

        System.arraycopy(array, 0, sortedArray, 0, array.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < (sortedArray.length - 1); i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
