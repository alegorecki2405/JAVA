public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }
    public void power(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        theMonitor.drowPixelAt(1200,50,"yellow");
    }

}
