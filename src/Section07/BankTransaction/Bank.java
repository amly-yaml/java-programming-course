package Section07.BankTransaction;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchArrayList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchArrayList = new ArrayList<>();
    }

    // 1. add new Branch
    public boolean addBranch(String branchName){
        Branch findBranch = findBranch(branchName);
        if(findBranch == null){
            this.branchArrayList.add(new Branch(branchName));
            return true;

        }
        return false;
    }

    // 2. add newCustomer with init amount for that branch
    public boolean addNewCustomer(String branchName, String customerName, Double initAmount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            // this.branchArrayList.add(new Branch(branchName));
            existingBranch.addNewCustomer(customerName, initAmount);
            return true;

        }
        return false;
    }

    // 3. add additional transaction for that branch
    public boolean addNewTransaction(String branchName, String customerName, double amount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            return existingBranch.addCustomerTransaction(customerName, amount);

        }
        return false;
    }

    // 1. a. find branch to do function
    private Branch findBranch(String branchName){
        for(int i=0; i<this.branchArrayList.size();i++){
            Branch branch = this.branchArrayList.get(i);
            if(branch.getBranchName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    // 4. print the list of customers with optional transaction
    public boolean printListCustomers(String branchName, boolean transaction){
        Branch existingBranch = findBranch(branchName);

        if(existingBranch != null){
            System.out.println("Showing Branch - " + existingBranch.getBranchName());

            ArrayList<Customer> customerArrayList = existingBranch.getCustomerArrayList();
            System.out.println("Detail of Customers: " + "\n" +
                    "--------------------" );
            for(int i=0; i<customerArrayList.size(); i++){
                Customer getCustomerName = customerArrayList.get(i);
                System.out.println("Customer " + (i+1) + ". " + getCustomerName.getCustomerName());

                if(transaction){
                    System.out.println("Transaction: ");
                    ArrayList<Double> transactionList = getCustomerName.getTransaction();
                    for (int j=0; j<transactionList.size(); j++){
                        System.out.println((j+1) + ". Amount - " + transactionList.get(j));

                    }
                }

            }
            return true;
        }
        else {
            return false;
        }

    }
}
