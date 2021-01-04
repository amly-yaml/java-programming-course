package Section06.Inheritance;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 1, 1, 5, 5);

        Dog dog = new Dog("Totty", 8, 20, 2, 2, 1, 20, "fur white");
        dog.move(5);
        dog.walk();
    }
}
