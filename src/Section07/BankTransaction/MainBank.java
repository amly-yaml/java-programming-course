package Section07.BankTransaction;

import java.util.Scanner;

public class MainBank {
    private static Bank bank = new Bank("MAB");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // printOption();
        while (true){
            System.out.println();

            printOption();
            System.out.println();
            System.out.println("Please enter the option: ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose){
                case 0:
                    System.out.println("Shutting down...");
                    break;
                case 1:
                    System.out.println("You choose to add new branch.");
                    addingBranch();
                    break;
                case 2:
                    System.out.println("You choose to add new customer in existing branch.");
                    addNewCustomer();
                    break;
                case 3:
                    System.out.println("You choose to do the transaction in existing branch and name.");
                    addNewTransaction();
                    break;
                case 4:
                    System.out.println("You choose to print all the list of detail data in existing branch.");
                    listBankData();
                    break;
                case 5:
                    printOption();
                    break;
                default:
                    System.out.println("Invalid Enter!!");

            }
            if(choose==0){
                break;
            }

        }

//        System.out.println("Please add for branch name: ");
//        String branchName = scanner.nextLine();
//
//        if(bank.addBranch(branchName)){
//            System.out.println(branchName + " is added.");
//        }
//        else {
//            System.out.println(branchName + " is already existed.");
//        }
//
//        String customername = scanner.nextLine();
//        double initamount = scanner.nextDouble();
//
//        if(bank.addNewCustomer(branchName, customername, initamount)){
//            System.out.println("It is added.");
//        }
//        bank.printListCustomers(branchName, true);


//        bank.addBranch("Botahtaung");
//        bank.addNewCustomer("Botahtaung", "Timmy", 456.89);
//        bank.addNewCustomer("Botahtaung", "Timmy", 406.89);
//        bank.addNewCustomer("Botahtaung", "Kiity", 4891.09);
//
//        bank.addNewTransaction("Botahtaung", "Timmy", 45.89);
//        bank.addNewTransaction("Botahtaung", "Timmy", 46.89);
//        bank.addNewTransaction("Botahtaung", "Timmy", 400.89);
//
//        bank.printListCustomers("Botahtaung", true);
//
//        bank.addBranch("Lanmadaw");
//        bank.addNewCustomer("Lanmadaw", "U Kyaw", 90.89);
//        bank.addNewCustomer("Lanmaw", "U Kyaw", 90.89);
//
//        bank.printListCustomers("Lanmadaw", false);
//
//        if(bank.addBranch("Lanmadaw")) {
//            System.out.println("Adelaide branch already exists");
//        }else{
//            System.out.println("It is added.");
//        }
//
//        if(!bank.addNewCustomer("Botahtaung", "Timmy", 34.89)){
//            System.out.println("Timmy is already added.");
//        }else {
//            System.out.println("hello");
//        }
//
//        System.out.println(bank.addNewCustomer("Botahtaung", "Timmy", 34.89));
//

    }

    public static void printOption(){
        System.out.println("Please choose option: ");
        System.out.println("0. Shut down the App" + "\n" +
                "1. Add New Branch"  + "\n" +
                "2. Add New Customer" + "\n" +
                "3. Add New Transaction for that customer" + "\n" +
                "4. Print all the list of customers" + "\n" +
                "5. Print the option");
    }

    private static void addingBranch(){
        System.out.println("Enter new branch name: ");
        String branchName = scanner.nextLine();
        if(branchName.equals("")){
            System.out.println("Make sure you enter the branch name!!");
        }
        else {
            if(bank.addBranch(branchName))
                System.out.println(branchName + " is added in the branch record.");
            else{
                System.out.println(branchName + " is already existed in the record.");
            }
        }
    }

    private static void addNewCustomer(){
        System.out.print("Enter existing branch name: ");
        String branchName = scanner.nextLine();

        System.out.print("Enter new customer name: ");
        String customername = scanner.nextLine();

        System.out.print("Enter init amount: ");
        double initamount = scanner.nextDouble();

        if(bank.addNewCustomer(branchName, customername, initamount)){
            System.out.println(customername + " is added in the record.");
        }else{
            System.out.println("Please make sure the data is valid.");
        }

    }

    private static void addNewTransaction(){
        System.out.print("Enter existing branch name: ");
        String branchName = scanner.nextLine();

        System.out.print("Enter existing name: ");
        String customername = scanner.nextLine();

        System.out.print("Enter amount: ");
        double initamount = scanner.nextDouble();

        if(bank.addNewTransaction(branchName, customername, initamount)){
            System.out.println("New transaction for " + customername +  " is added in the record.");
        }else{
            System.out.println("Please make sure the data is valid.");
        }

    }

    private static void listBankData(){
        System.out.print("Enter existing branch name: ");
        String branchName = scanner.nextLine();

        System.out.println("you want transaction showing or not? enter true or false: ");
        boolean transaction = scanner.nextBoolean();

        if (bank.printListCustomers(branchName, transaction)){
            System.out.println("");
        }
        else {
            System.out.println(branchName + " does not have in the database.");
        }
    }

}
