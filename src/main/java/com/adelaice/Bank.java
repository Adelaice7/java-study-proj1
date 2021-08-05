package com.adelaice;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) == null) {
            Branch branch = new Branch(branchName);
            this.branches.add(branch);
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addNewCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Customers for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer customer = branchCustomers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = customer.getTransactions();

                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println((j + 1) + ". transaction: " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }

    }

    private Branch findBranch(String branchName) {
        for (Branch branch : this.branches) {
            if (branchName.equals(branch.getName())) {
                return branch;
            }
        }

        return null;
    }


}
