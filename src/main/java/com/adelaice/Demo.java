package com.adelaice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "London");
        addInOrder(placesToVisit, "Paris");
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Stockholm");
        addInOrder(placesToVisit, "Rome");
        addInOrder(placesToVisit, "Dublin");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Cork");

//        placesToVisit.add("London");
//        placesToVisit.add("Paris");
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Stockholm");
//        placesToVisit.add("Rome");
//        placesToVisit.add("Dublin");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Cork");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Paris");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();

        while (i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }

        System.out.println("------------------------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);

            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included.");
                return false;
            } else if (comparison > 0) {
                // newCity should appear before this one
                // get back to previous entry because l.44 already moved the iterator to next element
                stringListIterator.previous();

                stringListIterator.add(newCity);
                return true;
            }// else if (comparison < 0) {
                // move on to next element
            //}
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the list.");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Bye!");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of list.");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("You are at the start of the list.");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\nPress");
        System.out.println("0 - to quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - print menu");
    }

}
