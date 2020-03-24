public class PerfectNumber {
    public static boolean isPerfectNumber(int number)
    {
        if(number<1)
        {
            return false;
        }
        int suma = 0;
        for(int i=1;i<=number/2;i++)
        {
            if(number%i==0)
            {
                suma+=i;

            }
        }
        if(number==suma)
        {
            return true;
        }
        return false;

    }
}
