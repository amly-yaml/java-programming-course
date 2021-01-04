package Section06.Classes;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customer_name;
    private String email;
    private int phoneNumber;

    public BankAccount(int accountNumber, int balance, String customer_name, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;

    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositField(int depositBalance){ // classes method
        this.balance += depositBalance;
        System.out.println("Deposit of " + depositBalance + " made. New Balance is " + this.balance);
    }
    public void withdrowField(int withdrawalBalance){   // classes method 
        if (balance < withdrawalBalance){
            System.out.println("Insufficient Fund. " + this.balance + " is available to withdrawal.");
        }else {
            this.balance -= withdrawalBalance;
            System.out.println("Withdraw of " + withdrawalBalance + " processed. Remaining Balance is " + this.balance);
        }
    }
}
