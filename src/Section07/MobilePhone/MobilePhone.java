package Section07.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<>();
    }

    // add contact
    public boolean addContact(Contact contact){
        if (findContact(contact.getUserName())>=0){
            System.out.println(contact.getUserName() + " is already existed in the contact.");
            return false;

        }
        this.myContact.add(contact);
        return true;
    }

    // modify contact/ update Contect
    public boolean updateContact(Contact oldcontact, Contact newcontact){
        int position = findContact(oldcontact);
        if(position < 0){
            System.out.println("Record was not found in the contact list.");
            return false;
        }
        // not allow duplicate record
        else if(findContact(newcontact.getUserName())!=-1) {
            System.out.println("Contact was already existed. Update was not successful.");
            return false;
        }

        this.myContact.set(position, newcontact);
        System.out.println(oldcontact.getUserName() + " was replaced with " + newcontact.getUserName());
        return true;


    }

    // query contact with return String
    private String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getUserName();
        }
        return null;
    }

    // query contact with return the contact which represented the whole set of one sepific list
    // by enter name
    public Contact queryContact(String name){
        int position = findContact(name);
        if(position>=0){
            return this.myContact.get(position);
        }
        return null;
    }

    // remove contact with name
//    public boolean removeContact(String contactName){
//        int position = findContact(contactName);
//        if(position<0){
//            // System.out.println(contactName + " was not existed.");
//            return false;
//        }
//        this.myContact.remove(position);
//        // System.out.println(contactName + " was successfully deleted.");
//        return true;
//    }

    // remove contact with contact
    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position < 0){
            System.out.println("Contact Record was not found.");
            return false;
        }
        this.myContact.remove(position);
        return true;
    }

    // print all the contact list
    public void printContact(){
        System.out.println("Contact List");
        System.out.println("************");
        for (int i=0; i<this.myContact.size(); i++){
            System.out.println(i+1 + ". " + this.myContact.get(i).getUserName() + " --> "
                                + this.myContact.get(i).getPhoneNumber());
        }
        System.out.println();

    }


    // find contact with name
    private int findContact(String contactName){
        for(int i=0; i<this.myContact.size(); i++){
            Contact contact = this.myContact.get(i);
            if(contact.getUserName().equals(contactName)){
                return i;

            }
        }
        return -1;
    }

    // find contact with index position
    private int findContact(Contact contact){
        return this.myContact.indexOf(contact);
    }

}
