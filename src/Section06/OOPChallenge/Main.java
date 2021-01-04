package Section06.OOPChallenge;

public class Main {
    public static void main(String[] args) {
        Burgers burgers = new Burgers("Basic", "Beef", "White", 5.60);
        burgers.addItems1("cheese", 1.00);  // call the addItems1
        burgers.addItems2("tomato", 1.50);  // call the addItems2
        burgers.addItems3("cucumber", 1.00);  // call the addItems3
        System.out.println("Total Burger price is " + burgers.finalPriceBurger());  // call the finalPriceBurger in base Burger

        System.out.println();
        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 3.50);
        healthyBurger.addItems1("Lettuce", 1.00);
        healthyBurger.addHealthyItem1("Egg", 1.00);
        System.out.println("Total Burger price is " + healthyBurger.finalPriceBurger()); // call the finalPriceBurger in healthy Burger

        System.out.println();
        DeluxBurger deluxBurger = new DeluxBurger("Double Beef", 5.60);
        System.out.println("Total Burger price is " + deluxBurger.finalPriceBurger()); // call the finalPriceBurger in base Burger



    }


}
