import java.util.Scanner;

public class SOMA_Iterativa {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número:");
        int n = in.nextInt();
        somaDosNumeros(n);
    }

    public static void somaDosNumeros(int n){
        int soma = 0;
        for (int i = 1; i <= n; i++){
            soma += i;
        }
        System.out.println("A soma de todos os números até o "+n+" é de "+soma);
    }

//    função recursiva(param) {
//        se (condicaoDeParada) {
//            return resultado;
//        } else {
//            return recursiva(transformar(param));
//        }
//    }

}
