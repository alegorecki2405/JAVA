public class SumOddRange {
    public static boolean isOdd(int number){
        if(number<=0 || number%2==0)
        {
            return false;
        }
        return true;

    }
    public static int sumOdd(int start,int end)
    {
        int suma = 0;
        if(start>end || end<0 || start<0)
        {
            return -1;
        }

        for(int i=start;i<=end;i++)
        {
            if(isOdd(i))
            {
                suma+=i;
            }


        }
        return suma;
    }
}
