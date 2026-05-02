import java.util.Arrays;
import java.util.Random;

public class BuscaBinaria_Iterativa {

    public static int buscaBinariaIterativa(int[] vetor, int valorProcurado){
        int inicio = 0;
        int fim = vetor.length - 1;
        while(inicio <= fim){
            int centro = (inicio+fim)/2;
            if (valorProcurado == vetor[centro]){
                return centro;
            }
            if (valorProcurado < vetor[centro]){
                fim = centro - 1;
            }
            else {
                inicio = centro + 1;
            }
        }
        return -1;
    }

    public static void preencherEOrdenar(int[] vetor, int limite) {
        Random gerador = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(limite);
        }
        Arrays.sort(vetor);
    }

    public static void imprimirResultado(int resultado) {
        if (resultado == -1) {
            System.out.println("Não achou o valor!");
        } else {
            System.out.println("Achado na posição " + resultado);
        }
    }

    public static void main(String[] args){
        int[] vetor1 = new int[10];
        int valorProcurado = 15;

        int[] vetor2 = new int[25];
        int[] vetor3 = new int[50];
        int[] vetor4 = new int[100];

        preencherEOrdenar(vetor1, 26);
        preencherEOrdenar(vetor2, 51);
        preencherEOrdenar(vetor3, 101);
        preencherEOrdenar(vetor4, 201);

        int resultado1 = buscaBinariaIterativa(vetor1, valorProcurado);
        imprimirResultado(resultado1);

        int resultado2 = buscaBinariaIterativa(vetor2, valorProcurado);
        imprimirResultado(resultado2);

        int resultado3 = buscaBinariaIterativa(vetor3, valorProcurado);
        imprimirResultado(resultado3);

        int resultado4 = buscaBinariaIterativa(vetor4, valorProcurado);
        imprimirResultado(resultado4);
    }
}
