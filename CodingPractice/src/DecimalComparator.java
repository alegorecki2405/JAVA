public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a,double b){
        a=a*1000;
        b=b*1000;

        int liczbaPierwsza = (int) a;
        int liczbaDruga = (int) b;

        if (liczbaDruga == liczbaPierwsza) {

            return true;
        }
        return false;
    }
}
