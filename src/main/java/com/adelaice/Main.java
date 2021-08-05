package com.adelaice;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;

        int choice;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.listContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    private static void removeContact() {
        System.out.print("Enter contact name to remove: ");
        String name = scanner.nextLine();

        mobilePhone.removeContact(name);

        System.out.println(name + " has been successfully removed.");
    }

    private static void searchContact() {
        System.out.print("Enter contact name to search: ");
        String name = scanner.nextLine();

        Contact foundContact = mobilePhone.findContactByName(name);

        if (foundContact != null) {
            System.out.println("Found a contact with name " + name);
            System.out.println("Name: " + foundContact.getName()
                    + " | Phone number: " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Could not find contact with name " + name + "!");
        }
    }

    private static void updateContact() {
        System.out.print("Enter contact name to update: ");
        String oldName = scanner.nextLine();

        Contact oldContact = mobilePhone.findContactByName(oldName);

        if (oldContact != null) {
            System.out.print("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new contact phone number: ");
            String newPhoneNumber = scanner.nextLine();

            Contact newContact = new Contact(newName, newPhoneNumber);
            mobilePhone.updateContact(oldContact, newContact);
        } else {
            System.out.println("A contact with name " + oldName + " does not exist!");
        }

    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber);

        boolean addedContact = mobilePhone.addContact(contact);

        if (addedContact) {
            System.out.println("Successfully added " + name + " to contacts!");
        } else {
            System.out.println("Contact already exists!");
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add new contact to the contacts.");
        System.out.println("\t 3 - To modify a contact in the contacts.");
        System.out.println("\t 4 - To remove a contact from the contacts.");
        System.out.println("\t 5 - To search for a contact in the contacts.");
        System.out.println("\t 6 - To quit the application.");
    }
}
