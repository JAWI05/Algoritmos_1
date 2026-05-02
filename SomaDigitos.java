import java.util.Scanner;

public class SomaDigitos {
    public static int SomaDig(int n){
        n = Math.abs(n);
        int digito = n % 10;
        if (digito <= 0){
            return 0;
        }
        return digito + SomaDig(n/10);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = in.nextInt();
        System.out.println(SomaDig(n));
    }
}
