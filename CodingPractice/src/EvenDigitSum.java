public class EvenDigitSum {
    public static int getEvenDigitSum(int number)
    {
        if(number<0)
        {
            return -1;
        }
        String strNumber = Integer.toString(number);
        int b = 0;
        int suma=0;
        for(int i = 0; i<strNumber.length();i++)
        {
            b = Character.getNumericValue(strNumber.charAt(i));
            if(b%2==0)
            {
                suma+=b;
            }


        }
        return suma;
    }
}
