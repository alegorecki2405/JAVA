public class Motherboard {
    private String model;
    private String manufactorer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufactorer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String progamName){
        System.out.println("program "+progamName+" is now loaded");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufactorer(String manufactorer) {
        this.manufactorer = manufactorer;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
