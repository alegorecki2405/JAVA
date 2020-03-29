import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage()
    {
        int suma = 0;
        int licznik = 0;
        Scanner scanner = new Scanner(System.in);
        while (true)
        {

            boolean hasAnInt = scanner.hasNextInt();
            if(hasAnInt)
            {
                suma+=scanner.nextInt();
                scanner.nextLine();
                licznik+=1;
            }
            else
            {
                long srednia = suma/ licznik;
                System.out.println("SUM = "+suma+" AVG = "+srednia);
                break;
            }
        }
    }
}
