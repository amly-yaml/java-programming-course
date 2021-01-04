package Section06.Composition.Decoration;

public class MainBed {
    public static void main(String[] args) {
        Wall wall1 = new Wall("EAST");
        Wall wall2 = new Wall("WEST");
        Wall wall3 = new Wall("SOUTH");
        Wall wall4 = new Wall("NORTH");

        Lamp lamp = new Lamp("Classic", false, 3);
        Ceiling ceiling = new Ceiling(12, 43);
        Bed bed = new Bed("Modern", 7, 3, 4, 1);
        Bedroom bedroom = new Bedroom("Kyi", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
