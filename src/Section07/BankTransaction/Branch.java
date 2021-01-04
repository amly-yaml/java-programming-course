package Section07.BankTransaction;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customerArrayList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerArrayList = new ArrayList<>();
    }

    public boolean addNewCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customerArrayList.add(new Customer(customerName, initialAmount));
            // System.out.println(customerName + " already have.");
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;

        }
        return false;

    }

    private Customer findCustomer(String customerName){
        for (int i=0; i<this.customerArrayList.size(); i++){
            Customer customerCheck = this.customerArrayList.get(i);
            if(customerCheck.getCustomerName().equals(customerName)){
                return customerCheck;
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }
}
