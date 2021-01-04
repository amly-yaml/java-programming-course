package Section07.MobilePhoneReview;

public class Contact {
    private String name;
    private String mobilePhone;

    public Contact(String name, String mobilePhone) {
        this.name = name;
        this.mobilePhone = mobilePhone;
    }

    public String getName() {
        return name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public static Contact creatContact (String name, String mobilePhone){
        return new Contact(name, mobilePhone);
    }
}
