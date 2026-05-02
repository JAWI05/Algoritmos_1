import java.util.Scanner;

public class fatorial_recursivo {

    public static int fatorialResursivo(int n){
        if (n == 1){
            return 1;
        }
        return n * fatorialResursivo(n-1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int n = in.nextInt();
        System.out.println(fatorialResursivo(n));
    }
}
