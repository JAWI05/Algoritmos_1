import java.util.Scanner;

public class Piramide {
    public static void piramide(int n, int num){
        if (n == 0){
            return;
        }
        for (int i = n; i <= num; i++){
            System.out.print("*");
        }
        System.out.println();
        piramide(n-1, num);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int n = in.nextInt();
        piramide(n, n);
    }
}
