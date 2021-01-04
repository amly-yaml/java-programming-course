package Section07.MobilePhone;

import java.util.Scanner;
import java.util.SortedMap;

public class MainPhone {
    private static  Scanner scanner = new Scanner(System.in);
    private static  MobilePhone mobilePhone = new MobilePhone("095212695");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printAction();

        while(!quit){
            System.out.println("Choose your action: ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose){
                case 0:
                    System.out.println("Shutting down..");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    querycontact();
                    break;
                case 6:
                    printAction();
                    break;
            }
        }

    }

    // add new Contact
    private static void addContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phoneNumber = scanner.nextLine();

        // Create new Contact
        Contact newContact = Contact.createContact(name, phoneNumber);
        if(mobilePhone.addContact(newContact)){
            System.out.println("New contact added: name = " + name + ", phone = " + phoneNumber);
        }

    }

    // remove the Contact
//    private static void removeContact(){
//        System.out.println("Enter a name: ");
//        String name = scanner.nextLine();
//        if (mobilePhone.removeContact(name)){
//            System.out.println(name + " was successfully deleted.");
//        }
//        else {
//            System.out.println(name + " was not existed in the list.");
//        }
//
//    }

    // update the contact
    private static void updateContact(){
        System.out.print("Enter existing contact name: ");
        String currentName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(currentName);
        if(existingContactRecord == null){
            System.out.println( currentName + " contact record not found.");
        }
        else {
            System.out.print("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new phone number:  ");
            String newPhone = scanner.nextLine();
            // update the new record
            Contact newContactRecord = Contact.createContact(newName, newPhone);
            if(mobilePhone.updateContact(existingContactRecord, newContactRecord)){
                System.out.println("Successfully updated the record.");
            }
            else {
                System.out.println("Error occurred updating.");
            }
        }

    }

    // query contact
    private static void querycontact(){
        System.out.println("Enter the contact name: ");
        String exitName = scanner.nextLine();
        Contact exitingContactRecord = mobilePhone.queryContact(exitName);
        if(exitingContactRecord == null){
            System.out.println("Record does not found.");
        }
        else {
            System.out.println("Name: " + exitingContactRecord.getUserName() + " Phone: " + exitingContactRecord.getPhoneNumber());
        }
    }

    // remove contact with Contact
    private static void removeContact(){
        System.out.print("Enter the contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found.");
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Contact was successfully deleted.");
        }
        else {
            System.out.println("Error occurred deleting.");
        }
    }

    private static void startPhone(){
        System.out.println("Welcome Starting Phone!!");
    }

    private static void printAction(){
        System.out.println("Available Action Below:");
        System.out.println("------------------------");
        System.out.println("0 - to shutdown the application\n" +
                           "1 - to print the contact\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update the existing contact\n" +
                           "4 - to remove the contact\n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - to print a list of available action"
                );
        // System.out.println("Choose your action: ");
    }
}
