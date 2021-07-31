package com.adelaice;

import java.util.Scanner;

public class TestWhile {

    public static void readMinMaxNums() {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        boolean first = true;

        while (true) {
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (first) {
                    min = number;
                    max = number;
                    first = false;
                }

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid number!");
                System.out.println("Minimum number entered: " + min);
                System.out.println("Maximum number entered: " + max);
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
