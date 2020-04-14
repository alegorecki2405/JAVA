public class Main {
    public static void main(String[] args) {
        Tap tap1= new Tap(true);
        Tap tap2= new Tap(false);
        Bathtub wanna = new Bathtub(20,20,100,tap1);
        Sink umywalka = new Sink(10,10,10,tap2);
        Bathroom łazienka = new Bathroom(wanna,umywalka);
    }
}
