import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int numVendas, n = 0;
        double valor;
        double soma = 0, maior = 0, menor = 999999999;
        System.out.print("Quantos valores de venda serão inseridos: ");
        numVendas = in.nextInt();
        ArrayList<Double> vendas = new ArrayList<>();

        while(numVendas > n){
            System.out.println("Digite o valor da venda: ");
            valor = in.nextDouble();
            soma = soma + valor;
            maior = Math.max(valor, maior);
            menor = Math.min(valor, menor);
            vendas.add(valor);

            n += 1;
        }

        System.out.println("O valor total das vendas é de: "+soma);
        System.out.println("O valor máximo de vendas foi de "+maior+" e o menor foi de "+menor);
    }
}
