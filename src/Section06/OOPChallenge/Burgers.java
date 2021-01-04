package Section06.OOPChallenge;

public class Burgers {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String additional1Name;
    private double additoional1Price;
    private String additional2Name;
    private double additoional2Price;
    private String additional3Name;
    private double additoional3Price;
    private String additional4Name;
    private double additoional4Price;


    public Burgers(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addItems1(String name, double price){
        this.additional1Name = name;
        this.additoional1Price = price;
    }
    public void addItems2(String name, double price){
        this.additional2Name = name;
        this.additoional2Price = price;
    }
    public void addItems3(String name, double price){
        this.additional3Name = name;
        this.additoional3Price = price;
    }
    public void addItems4(String name, double price){
        this.additional4Name = name;
        this.additoional4Price = price;
    }

    public double finalPriceBurger(){
        double burgerPrice = this.price;
        System.out.println(this.name + " with a " + this.breadRollType + " roll type and " + this.meat +
                ", the price is " + this.price + ".") ;
        if (additional1Name != null){
            burgerPrice += this.additoional1Price;
            System.out.println(this.additional1Name + " add on and extra price is " + this.additoional1Price + ".");
        }
        if (additional2Name != null){
            burgerPrice += this.additoional2Price;
            System.out.println(this.additional2Name + " add on and extra price is " + this.additoional2Price + ".");
        }
        if (additional3Name != null){
            burgerPrice += this.additoional3Price;
            System.out.println(this.additional3Name + " add on and extra price is " + this.additoional3Price + ".");
        }
        if (additional4Name != null){
            burgerPrice += this.additoional4Price;
            System.out.println(this.additional4Name + " add on and extra price is " + this.additoional4Price + ".");
        }
        return burgerPrice;

    }
}
