import java.util.Scanner;

public class MinAndMax {
    public static void maxAndMin()
    {

        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter the number :");
            boolean isAnInt=scanner.hasNextInt();
            if(isAnInt)
            {
                int liczba = scanner.nextInt();
                int max = liczba;
                int min = liczba;
                while (true)
                {
                    System.out.println("Enter the number :");
                    boolean hasAnInt=scanner.hasNextInt();
                    if(hasAnInt)
                    {
                        liczba = scanner.nextInt();
                        if(liczba>max)
                        {
                            max=liczba;
                        }
                        else if(liczba<min)
                        {
                            min=liczba;
                        }
                        scanner.nextLine();
                    }
                    else
                    {

                        System.out.println("Maximu number is equal to : "+max);
                        System.out.println("Minimum number is equal to : "+min);
                        break;
                    }

                }
                break;
            }
            else
            {
                scanner.nextLine();
                System.out.println("you passed the invalid numbers so there is no max and min");

                break;
            }
        }


    }
}
