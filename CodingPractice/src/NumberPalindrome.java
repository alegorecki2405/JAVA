public class NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        if(number<0)
        {
            number=number*(-1);
        }
        String strnumber = Integer.toString(number);
        StringBuilder reversed = new StringBuilder("");

        for(int i=strnumber.length()-1;i>=0;i--)
        {
            reversed.append(strnumber.charAt(i));
        }

        if(strnumber.equals(reversed.toString()))
        {
            return true;
        }
        return false;
    }
}
