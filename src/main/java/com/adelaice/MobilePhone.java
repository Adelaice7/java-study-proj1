package com.adelaice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MobilePhone {
    private ArrayList<Contact> contactsList = new ArrayList<>();

    public void listContacts() {
        System.out.println("You have " + contactsList.size() + " contacts.");
        for (Contact contact : contactsList) {
            System.out.println("Name: " + contact.getName() + " | Phone number: " + contact.getPhoneNumber());
        }
    }

    public boolean addContact(Contact contact) {
        Contact searchedContact = findContactByName(contact.getName());

        if (searchedContact == null) {
            contactsList.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        int pos = findContact(oldContact.getName());
        if (pos >= 0) {
            contactsList.set(pos, newContact);
            System.out.println("Updated contact!");
        }
    }

    public void removeContact(String name) {
        Contact contact = findContactByName(name);

        if (contact != null) {
            removeContact(contact);
        } else {
            System.out.println("Could not find contact with name " + name + "!");
        }
    }

    public void removeContact(Contact contact) {
        int pos = findContact(contact);
        if (pos >= 0) {
            contactsList.remove(pos);
        }
    }

    public Contact findContactByName(String name) {
        List<Contact> filteredContacts = contactsList.stream()
                .filter(contact -> name.equals(contact.getName()))
                .collect(Collectors.toList());

        if (filteredContacts.size() > 0) {
            return filteredContacts.get(0);
        }

        return null;
    }

    private int findContact(Contact contact) {
        return contactsList.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.contactsList.size(); i++) {
            Contact contact = this.contactsList.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }

        return -1;
    }
}
