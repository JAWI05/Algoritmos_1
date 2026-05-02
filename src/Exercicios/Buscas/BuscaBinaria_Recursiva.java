import java.util.Arrays;
import java.util.Random;

public class BuscaBinaria_Recursiva {

    public static int buscaBinariaRecursiva(int[] array, int inicio, int fim, int valorProcurado){
        if (inicio > fim){
            return -1;
        }
        int meio = (inicio+fim)/2;
        if (array[meio] == valorProcurado){
            return meio;
        }
        if (array[meio] < valorProcurado){
            return buscaBinariaRecursiva(array, meio+1, fim, valorProcurado);
        }
        else {
            return buscaBinariaRecursiva(array, inicio, meio-1, valorProcurado);
        }
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

        int resultado1 = buscaBinariaRecursiva(vetor1, 0, vetor1.length-1, valorProcurado);
        imprimirResultado(resultado1);

        int resultado2 = buscaBinariaRecursiva(vetor2, 0, vetor2.length-1, valorProcurado);
        imprimirResultado(resultado2);

        int resultado3 = buscaBinariaRecursiva(vetor3, 0, vetor3.length-1, valorProcurado);
        imprimirResultado(resultado3);

        int resultado4 = buscaBinariaRecursiva(vetor4, 0, vetor4.length-1, valorProcurado);
        imprimirResultado(resultado4);
    }
}
