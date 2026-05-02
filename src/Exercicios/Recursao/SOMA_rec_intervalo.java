import java.util.Scanner;

public class SOMA_rec_intervalo {

    public static int somaRecursiva(int m, int n){
        if(n == m){
            return m;
        }
        return n + somaRecursiva(m, n-1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Soma recursiva de: ");
        int m = in.nextInt();
        System.out.print("até: ");
        int n = in.nextInt();

        System.out.println(somaRecursiva(m, n));
    }
}
