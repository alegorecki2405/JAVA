public class Case {
    private String model;
    private String manufactorer;
    private String powerSuply;
    private Dimensions dimensions;

    public Case(String model, String manufactorer, String powerSuply, Dimensions dimensions) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.powerSuply = powerSuply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public String getPowerSuply() {
        return powerSuply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
