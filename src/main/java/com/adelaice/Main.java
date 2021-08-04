package com.adelaice;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] integers = getIntegers(5);

        for (int i = 0; i < integers.length; i++) {
            System.out.println("Element " + i + " is of value: " + integers[i]);
        }

        System.out.println("Average is " + getAverage(integers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers!");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        double average = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        average = sum / (double) array.length;

        return average;
    }
}
