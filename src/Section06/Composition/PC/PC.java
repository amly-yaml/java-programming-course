package Section06.Composition.PC;

public class PC {
    private MotherBoard motherBoard;
    private Case aCase;
    private Monitor monitor;

    public PC(MotherBoard motherBoard, Case aCase, Monitor monitor) {
        this.motherBoard = motherBoard;
        this.aCase = aCase;
        this.monitor = monitor;
    }

    // making function // this is to prevent error when under public make private
    public void powerUp(){
        aCase.pressPowerButton();
        motherBoard.loadProgram("Window 11");
        drawLogo();
    }

    public void drawLogo(){
        monitor.drawPixelAt(1200, 50, "blue");
    }

    public MotherBoard getMotherBoard() {   // can change private but make error in Main
        return motherBoard;
    }

    public Case getaCase() {
        return aCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
