import java.util.Scanner;

public class FindMin {
    public static int[] readIntegers(int count)
    {
        Scanner scan = new Scanner(System.in);
        int[] tab = new int[count];
        for(int i=0;i<count;i++){
            tab[i] = scan.nextInt();

        }
        return tab;
    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int i=1;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }

        }
        return min;

    }

}
