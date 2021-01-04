package Section07.MobilePhoneReview;

import java.util.Scanner;
import java.util.SortedMap;

public class MainMobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("098765");

    public static void main(String[] args) {
        boolean quit = false;
        startApp();
        printAction();

        while (!quit) {
            System.out.print("Please choose action: ");
            // need to enter int
//            boolean hasInt = scanner.hasNextInt();
//            if(hasInt) {
            char choose = scanner.next().charAt(0);
            scanner.nextLine();
            switch (choose) {
                case '0':
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case '1':
                    mobilePhone.printContact();
                    break;
                case '2':
                    addNewContact();
                    break;
                case '3':
                    updateContact();
                    break;
                case '4':
                    removeContact();
                    break;
                case '5':
                    queryContact();
                    break;
                case '6':
                    printAction();
                    break;
                default:
                    System.out.println("Make sure enter 0 to 6 😂");
            }
        // }
//            else {
//                System.out.println("Please enter number 😀");
//                break;
//            }

        }


    }

    private static void addNewContact(){
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String  newPhone = scanner.nextLine();
        // boolean hasString = scanner.hasNext();

        Contact newContact = Contact.creatContact(newName, newPhone);
        if (mobilePhone.addContact(newContact)) {
            System.out.println(newName + " record was added in the contact list.");
        } else {
            System.out.println("Error occurs when new added.");
        }
    }

    private static void updateContact(){
        System.out.println("Enter current name: ");
        String oldName = scanner.nextLine();
        // System.out.println("Enter current number: ");
        //String oldPhone = scanner.nextLine();

        Contact existingRecord = mobilePhone.queryContact(oldName);
        if(existingRecord == null){
            System.out.println("Record does not exit in the contact list.");
        }
        else {
            System.out.println("Enter new name: ");
            String nName = scanner.nextLine();
            System.out.println("Enter new number: ");
            String nPhone = scanner.nextLine();
            Contact updateContactRecord = Contact.creatContact(nName, nPhone);
            if(mobilePhone.modifyContact(existingRecord, updateContactRecord)){
                System.out.println("Record is successfully updated ");
            }
            else {
                System.out.println("Error occur when updating...");
            }

        }

    }

    private static void removeContact(){
        System.out.println("Enter remove name: ");
        String name = scanner.nextLine();
        Contact existingRecord = mobilePhone.queryContact(name);
        if(existingRecord == null){
            System.out.println("Record does not have in the contact list.");
        }
        else {
            if(mobilePhone.removeContact(existingRecord)){
                System.out.println("Successfully remove the record.");
            }
            else {
                System.out.println("Error occur when removing..");
            }
        }

    }

    private static void queryContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("There is no record.");
        }
        else {
            System.out.println("Name: " + existingContactRecord.getName() + "\nPhone: "
                    + existingContactRecord.getMobilePhone());
        }


    }
    public static void startApp(){
        System.out.println("Welcome My Contact");
    }

    private static void printAction(){
        System.out.println("------------------------");
        System.out.println("0 - to shutdown the application\n" +
                "1 - to print all the contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update the existing contact\n" +
                "4 - to remove the contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available action"
        );
    }
}
