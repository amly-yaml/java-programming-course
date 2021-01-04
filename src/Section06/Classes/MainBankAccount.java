package Section06.Classes;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(12345, 5000, "Aung Bo",
                "angretsophia@gmail.com", 95212695);

        bankAccount.depositField(1000);
        bankAccount.withdrowField(8000);
    }
}

