package com.adelaice;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National American Bank");

        bank.addNewBranch("Adelaice");
        bank.addCustomer("Adelaice", "Tim", 40.5);
        bank.addCustomer("Adelaice", "Mike", 20.55);
        bank.addCustomer("Adelaice", "Joe", 30.15);

        bank.addNewBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaice", "Tim", 44.21);
        bank.addCustomerTransaction("Adelaice", "Tim", 123.17);
        bank.addCustomerTransaction("Adelaice", "Tim", 2.54);

        bank.listCustomers("Adelaice", true);
    }
}
