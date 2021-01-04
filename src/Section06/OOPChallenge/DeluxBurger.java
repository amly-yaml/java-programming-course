package Section06.OOPChallenge;

public class DeluxBurger extends Burgers {

    public DeluxBurger(String meat, double price) {
        super("Delux", meat, "White Rye", price);
        super.addItems1("Chip", 1.50);
        super.addItems2("Drink", 1.50);

    }

    @Override
    public void addItems1(String name, double price) {
        System.out.println("Cannot add additional item.");
    }

    @Override
    public void addItems2(String name, double price) {
        System.out.println("Cannot add additional item.");

    }

    @Override
    public void addItems3(String name, double price) {
        System.out.println("Cannot add additional item.");

    }

    @Override
    public void addItems4(String name, double price) {
        System.out.println("Cannot add additional item.");

    }

}
