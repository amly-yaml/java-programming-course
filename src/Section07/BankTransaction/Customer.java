package Section07.BankTransaction;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transaction;

    public Customer(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transaction = new ArrayList<>();
        // get method for adding amount
        addTransaction(initialAmount);

    }

    // customer transaction add
    public void addTransaction(double amount){
        this.transaction.add(amount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
