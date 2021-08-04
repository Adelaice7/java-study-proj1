package com.adelaice;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = readIntegers(5);

        int minVal = findMin(array);

        System.out.println(minVal);

        scanner.close();
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];

        System.out.println("Enter " + count + " numbers: ");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                min = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

}
