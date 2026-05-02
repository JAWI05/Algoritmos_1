import java.util.Scanner;

public class SOMA_Recursiva {
    public static int somarRecursivamente(int n){
        // Caso base
        if (n == 1){
            return 1;
        }

        // Alteração de estado do parâmetro
        return n + somarRecursivamente(n-1);

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int n = in.nextInt();
        System.out.println(somarRecursivamente(n));

    }
}
