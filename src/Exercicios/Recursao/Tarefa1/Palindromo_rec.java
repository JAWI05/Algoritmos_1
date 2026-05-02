import java.util.Scanner;

public class Palindromo_rec {

    public static boolean palindromo(String palavra, int inicio, int fim){

        if (palavra.charAt(inicio) != palavra.charAt(fim)){
            return false;
        }
        if (inicio >= fim){
            return true;
        }

        return palindromo(palavra, inicio+1, fim-1);
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String palavra = in.nextLine();
        int n = palavra.length();
        System.out.println(palindromo(palavra, 0, n-1));
    }
}
