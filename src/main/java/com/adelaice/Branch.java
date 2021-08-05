package com.adelaice;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean addNewCustomer(String customerName, double initialAmt) {
        if (findCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialAmt);
            this.customers.add(customer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);

        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name) {
        for (Customer customer : this.customers) {
            if (name.equals(customer.getName())) {
                return customer;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
