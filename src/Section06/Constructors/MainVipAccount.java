package Section06.Constructors;

public class MainVipAccount {

    public static void main(String[] args) {
        VipAccount vip = new VipAccount();
        System.out.println(vip.getCustomerName() + " " + vip.getEmailAddress());

        VipAccount vip1 = new VipAccount("Tim", 8000.00);
        System.out.println(vip1.getCustomerName() + " " + vip1.getEmailAddress());

        VipAccount vip2 = new VipAccount("Kyi", 8000.00, "kyi@gmail.com");
        System.out.println(vip2.getCustomerName() + " " + vip2.getCreditLimit());
    }
}