package Section06.OOPChallenge;

public class HealthyBurger extends Burgers {
    private String additional1Name;
    private double additional1Price;
    private String additional2Name;
    private double additional2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, "Brown Rye Bread", price);
    }

    public void addHealthyItem1(String additional1Name, double additional1Price){
        this.additional1Name = additional1Name;
        this.additional1Price = additional1Price;
    }
    public void addHealthyItem2(String additional2Name, double additional2Price){
        this.additional2Name = additional2Name;
        this.additional2Price = additional2Price;
    }

    @Override
    public double finalPriceBurger() {
        double healthyBurgerPrice = super.finalPriceBurger();
        if(additional1Name!= null){
            healthyBurgerPrice += additional1Price;
            System.out.println(additional1Name + " add on for extra price is " + additional1Price);
        }
        if(additional2Name!= null){
            healthyBurgerPrice += additional2Price;
            System.out.println(additional2Name + " add on for extra price is " + additional2Price);
        }
        return healthyBurgerPrice;

    }
}
