package Section07.MobilePhoneReview;

import java.util.ArrayList;

public class MobilePhone {
    private String mobilePhone;

    // put Contact class to ArrayList
    private ArrayList<Contact> myContact;

    public MobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        this.myContact = new ArrayList<>();
    }
    // 1. Add Contact
    public boolean addContact(Contact contact){
        int position = findContact(contact);
        if(position < 0){
            // Array List has function for add, remove, modify , search/query
            this.myContact.add(contact);
            return true;
        }

        return false;
    }


    // 2. modify Contact
    public boolean modifyContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position<0){
            return false;
        }
//        else if (findContact(newContact.getMobilePhone())!=-1){
//            System.out.println(oldContact.getMobilePhone() + " is already existed.");
//            return false;
//        }
        else if (findContact(newContact.getName())!=-1){
            System.out.println(oldContact.getName() + " is already existed.");
            return false;
        }
        this.myContact.set(position, newContact);
        return true;

    }

    // 3. Remove item
    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position<0){
            return false;
        }
        this.myContact.remove(contact);
        return true;
    }

    // 4. find Constant by Contact list return int
    private int findContact(Contact contact){
        return this.myContact.indexOf(contact);

    }
        // find Constant by String name in list return String name
    private int findContact(String name){
        for (int i=0; i<this.myContact.size(); i++){
            // this.myContact.get(i) print name
            Contact positionName = this.myContact.get(i);
            if(positionName.getName().equals(name)){
                return i;
            }
        }
        return -1;

    }

//    private int findContact(int mobilePhone){
//        for (int i=0; i<this.myContact.size(); i++){
//            Contact positionPhone = this.myContact.get(i);
//            if(positionPhone.getMobilePhone() == mobilePhone){
//                return i;
//            }
//        }
//        return -1;
//
//    }


    // 5. print all Contacts list
    public void printContact(){
        System.out.println("Contact List");
        System.out.println("-------------");
        for (int i=0; i<this.myContact.size(); i++){
            System.out.println(i+1 + ". Name: " + this.myContact.get(i).getName() + "\n   Phone: "
                    + this.myContact.get(i).getMobilePhone());

        }
    }

    // 6. query Contact print all list such as name and phone etc ..
    public Contact queryContact(String existName){
        int position = findContact(existName);
        if(position>=0){
            return this.myContact.get(position);
        }
//        else if (this.myContact.get(position).getMobilePhone().equals(mobilePhone)){
//            return this.myContact.get(position);
//        }
        return null;
    }

}

