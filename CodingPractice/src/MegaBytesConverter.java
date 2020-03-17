public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = kiloBytes % 1024;
        System.out.println(megaBytes);
        System.out.println(kiloBytes+" KB = ");
    }
}
