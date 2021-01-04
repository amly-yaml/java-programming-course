package Section06.Composition.PC;

import Section06.Composition.PC.Monitor;
import Section06.Composition.PC.MotherBoard;
import Section06.Composition.PC.PC;
import Section06.Composition.PC.Resolution;

public class MainPC {
    public static void main(String[] args) {
        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");
        Case acase = new Case("2208", "Dell", "240", new Dimensions(20, 20, 5));

        Resolution resolution = new Resolution(2540, 1140);
        Monitor monitor = new Monitor("27inch Beast", 27, "Acer", resolution);

        PC pc = new PC(motherBoard, acase, monitor);
        pc.getMonitor().drawPixelAt(1500, 1200, "blue");
        pc.getMotherBoard().loadProgram("Window 10");
        pc.getaCase().pressPowerButton();

        pc.powerUp();


    }
}
