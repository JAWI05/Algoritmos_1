import java.util.Random;
import java.util.Scanner;

public class ARRAYrec {

    public static int SomaArray(int[] arr, int index){
        if (index == 0){
            return arr[index];
        }
        return arr[index] + SomaArray(arr, index-1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade de números no array: ");
        int n = in.nextInt();

        Random r = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(100);
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("\nSoma: "+SomaArray(array, array.length-1));
    }
}
