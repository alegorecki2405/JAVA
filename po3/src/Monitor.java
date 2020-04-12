public class Monitor {
    private String model;
    private String manufactorer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufactorer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drowPixelAt(int x,int y,String colour){
        System.out.println("drawing pixel at "+x+" , "+y+" in colour "+colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
