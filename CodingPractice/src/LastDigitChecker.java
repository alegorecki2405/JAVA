public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a,int b, int c){
        if(isValid(a) && isValid(b) && isValid(c))
        {
            if(a%10==b%10 || a%10==c%10 || b%10==c%10){
                return true;
            }
            return false;
        }
        return false;

    }

    public static boolean isValid(int x)
    {
        if(x>=10 && x<=1000)
        {
            return true;
        }
        return false;
    }
}
