package Section06.Constructors;

public class VipAccount {
    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipAccount(){
        this("default name", 600.00, "defaul@email.com");
    }


    public VipAccount(String customerName, double creditLimit) {
       this(customerName, creditLimit, "unknown@email.com");
    }

    public VipAccount(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
