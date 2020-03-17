public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a,double b){

        if (Math.floor(a*1000)==Math.floor(b*1000)) {
            System.out.println(Math.floor(a*1000));
            System.out.println(Math.floor(b*1000));
            return true;
        }
        return false;
    }
}
