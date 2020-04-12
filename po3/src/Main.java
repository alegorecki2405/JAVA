public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);
        Monitor theMonitor = new Monitor("27inch beast","Acer", 27,new Resolution(1920,1080));
        Motherboard theMotherboard = new Motherboard("Rj-200","Asus",4,6,"v2.46");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getTheMonitor().drowPixelAt(5,6,"red");
        thePC.getTheMotherboard().loadProgram("ubuntu 16.0");
        thePC.getTheCase().pressPowerButton();
    }
}
