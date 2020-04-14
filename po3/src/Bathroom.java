public class Bathroom {
    Bathtub bathtub;
    Sink sink;

    public Bathroom(Bathtub bathtub, Sink sink) {
        this.bathtub = bathtub;
        this.sink = sink;
    }

    public Bathtub getBathtub() {
        return bathtub;
    }

    public Sink getSink() {
        return sink;
    }
}
