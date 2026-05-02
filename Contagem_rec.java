import java.util.Scanner;

public class Contagem_rec {

    public static void contagem(int n){
        if (n == 1){
            System.out.println(1);
            System.out.println("Feliz Ano Novo");
            return;
        }
        System.out.println(n);
        contagem(n-1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Contagem: ");
        int n = in.nextInt();
        contagem(n);
    }
}
