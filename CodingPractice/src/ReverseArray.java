import java.util.Scanner;

public class ReverseArray {
    public static int[] readIntegers(int count)
    {
        Scanner scan = new Scanner(System.in);
        int[] tab = new int[count];
        for(int i=0;i<count;i++){
            tab[i] = scan.nextInt();

        }
        return tab;
    }
    public static void reverseArray(int[] array){
        int[] tab = new int[array.length];
        for(int i=0;i<array.length;i++){
            tab[array.length-i-1]=array[i];
        }
        for (int j=0;j<array.length;j++){
            System.out.println(tab[j]+" , "+array[j]);
        }


    }
}
