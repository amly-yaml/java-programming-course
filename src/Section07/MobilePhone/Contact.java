package Section07.MobilePhone;

public class Contact {
    private String userName;
    private String phoneNumber;

    public Contact(String userName, String phoneNumber) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // create a new contact record, when we accessing the function that are built into mobile phone
    // so instead of having to parse, the parameter name and number, can create a contact record
    // we can create it without creating a new separate object
    // static is important cuz that means we don't have to create a new object instance for this contact class
    // it is convient or factory method
    public static Contact createContact(String userName, String phoneNumber){
        return new Contact(userName, phoneNumber);
    }
}
