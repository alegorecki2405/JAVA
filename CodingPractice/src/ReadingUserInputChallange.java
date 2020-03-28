import java.util.Scanner;

public class ReadingUserInputChallange {

        public static void getsum()
        {
            int suma = 0;
            int i = 1;
            int liczba =0;
            Scanner scanner = new Scanner(System.in);
            while(i<=10) {
                System.out.println("Enter Number #" + i + ":");
                boolean hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    liczba=scanner.nextInt();
                    suma+=liczba;
                    i++;
                }
                else
                {
                    System.out.println("Invalid Number");
                }
                scanner.nextLine();

            }
            System.out.println("The sum of all the numbers is equal to: "+suma);
            scanner.close();
        }
}
