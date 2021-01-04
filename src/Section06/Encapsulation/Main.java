package Section06.Encapsulation;


public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println(printer.getTonerLever());
        System.out.println("Printing the pages " + printer.getPagesPrinted());
        int pagestoPrint = printer.pagesToPrinted(5);
        System.out.println("Printing the pages " + pagestoPrint + " total print count " + printer.getPagesPrinted());
        pagestoPrint = printer.pagesToPrinted(2);
        System.out.println("Printing the pages " + pagestoPrint + " total print count " + printer.getPagesPrinted());

        System.out.println(printer.addToner(50));
        System.out.println(printer.getTonerLever());



    }
}
