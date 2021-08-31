package com.adelaice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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
}
