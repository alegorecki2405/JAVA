public class LargestPrime {
    public static int getLargestPrime(int number)
    {
        int max = 1;
        int d = 0;
        if(number<=1)
        {
            return -1;
        }
        for(int i=1;i<=number;i++)
        {
            for(int j =1;j<=i;j++)
            {

                if(number%j==0)
                {
                    for(int x =2;x<=j/2;x++)
                    {
                        if(j%x==0)
                        {
                            d=1;
                        }

                    }
                    if(d==0)
                    {
                        max=j;
                    }
                    d=0;

                }
            }
        }

        return max;

    }

}
