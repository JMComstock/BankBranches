package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Community Bank");

        if (bank.addBranch("Orchard Park")) {
            System.out.println("Orchard Park branch created");
        }

        bank.addCustomer("Orchard Park", "Jason", 50.05);
        bank.addCustomer("Orchard Park", "Tim", 175.34);
        bank.addCustomer("Orchard Park", "Josh", 220.12);

        bank.addBranch("Buffalo");
        bank.addCustomer("Buffalo", "Sid", 150.54);

        bank.addCustomerTransaction("Orchard Park", "Jason", 44.22);
        bank.addCustomerTransaction("Orchard Park", "Jason", 12.44);
        bank.addCustomerTransaction("Orchard Park", "Tim", 1.65);

        bank.listCustomers("Orchard Park", true);
        bank.listCustomers("Buffalo", true);

        bank.addBranch("Tonawanda");

        if(!bank.addCustomer("Tonawanda", "Brian", 5.53)) {
            System.out.println("Error, Tonawanda branch does not exist");
        }

        if(!bank.addBranch("Orchard Park")) {
            System.out.println("Orchard Park branch already exists.");
        }

        if(!bank.addCustomerTransaction("Orchard Park", "Sean", 52.53)) {
            System.out.println("Customer does not exist at branch.");
        }

        if(!bank.addCustomer("Orchard Park" , "Jason", 12.21)) {
            System.out.println("Customer Jason already exists.");
        }
    }
}
