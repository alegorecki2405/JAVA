public class Bathtub {
    int width;
    int depth;
    int lenght;
    Tap tap1;

    public Tap getTap1() {
        return tap1;
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

    public Bathtub(int width, int depth, int lenght, Tap tap1) {
        this.width = width;
        this.depth = depth;
        this.lenght = lenght;
        this.tap1 = tap1;
    }
}
