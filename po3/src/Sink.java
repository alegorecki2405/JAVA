public class Sink {
    int width;
    int depth;
    int lenght;
    Tap tap2;

    public Tap getTap2() {
        return tap2;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getLenght() {
        return lenght;
    }

    public Sink(int width, int depth, int lenght, Tap tap1) {
        this.width = width;
        this.depth = depth;
        this.lenght = lenght;
        this.tap2 = tap2;
    }
}
