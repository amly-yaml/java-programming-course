package Section06.Encapsulation;

public class Printer {
    private int tonerLever;
    private boolean duplex;
    private int pagesPrinted;

    public Printer(int tonerLever, boolean duplex) {
        if (tonerLever > -1 && tonerLever <= 100){  // encapsulation
            this.tonerLever = tonerLever;
            // System.out.println(this.tonerLever);
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLever + tonerAmount >= 100){
                return -1;
            }
            else {
                this.tonerLever += tonerAmount;
                return this.tonerLever;
            }
        }
        return -1;
    }

    public int pagesToPrinted(int pages){
        int pagesPrinted = pages;
        if(this.duplex){
            pagesPrinted = (pagesPrinted/2)+(pagesPrinted%2);
            System.out.println("Printing in duplex mode.");

        }
        this.pagesPrinted += pagesPrinted;
        return pagesPrinted;
    }

    public int getTonerLever() {
        return tonerLever;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

