public class NumberToWords {
    public static void numberToWords(int number)
    {
        int x = number;
        if(number<0)
        {
            System.out.println("Invalid Value");
        }
        number=reverse(number);
        int count=0;
        while (number>0)
        {
            int a = number%10;
            number /= 10;
            switch (a)
            {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            count++;

        }

        int difference = getDigitCount(x)-count;
        if(difference>0)
        {
            for(int i=0;i<difference;i++)
            {
                System.out.println("Zero");
            }
        }
    }
    public static int reverse(int number){
        if(number<0)
        {
            number *=-1;
            String str = String.valueOf(number);
            StringBuilder strnumber = new StringBuilder(str);
            strnumber.reverse();
            return -1*(Integer.parseInt(strnumber.toString()));
        }
        else
        {
            String str = String.valueOf(number);
            StringBuilder strnumber = new StringBuilder(str);
            strnumber.reverse();
            return Integer.parseInt(strnumber.toString());
        }
    }
    public static int getDigitCount(int number)
    {
        if(number<0)
        {
            return -1;
        }
        if(number==0)
        {
            return 1;
        }
        int suma = 0;
        while (number>0)
        {
            int a = number%10;
            number /= 10;
            suma++;
        }
        return suma;
    }

}
