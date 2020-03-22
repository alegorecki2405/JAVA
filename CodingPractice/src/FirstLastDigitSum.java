public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0)
        {
            return -1;
        }
        String strNumber = Integer.toString(number);
        char a = strNumber.charAt(strNumber.length()-1);
        char b = strNumber.charAt(0);
        int suma = 0;
        suma += Character.getNumericValue(b);
        suma += Character.getNumericValue(a);
        return suma;
    }
}
