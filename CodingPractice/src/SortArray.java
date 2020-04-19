import java.util.ArrayList;
import java.util.Scanner;

public class SortArray {
    public static int[] sortArray(int[] array){
        int x;
        int y;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]<array[j])
                {
                x=array[i];
                y=array[j];
                array[i]=y;
                array[j]=x;

                }
            }
        }
        return array;
    }
    public static int[] getIntegers(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int x;
        for(int i=0;i<10;i++)
        {
            x = scan.nextInt();
            array.add(x);
        }
        int[] array2 = new int[array.size()];
        for(int i = 0;i<array.size();i++)
        {
            array2[i]=array.get(i);
        }

        return array2;


    }
    public static void printArray(int[] array){
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
