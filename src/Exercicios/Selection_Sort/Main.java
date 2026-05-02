import java.util.Random;

public class Main {

    public static void SelectionSort(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            int minimo = i;
            for (int j = i+1; j < vetor.length; j++){
                if (vetor[j] < vetor[minimo]){
                    minimo = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[minimo];
            vetor[minimo] = temp;
        }
        System.out.println();
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }

    public static void preencher(int[] vetor){
        // Criar um objeto Random
        Random random = new Random();
        // Gerar um número aleatório inteiro entre 0 e 99
        for (int i = 0; i < vetor.length; i++){
            int randomNumber = random.nextInt(100);
            vetor[i] = randomNumber;
        }
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] vtamanhos = {10, 50, 100, 500, 1000, 5000};
        for (int i = 0; i < vtamanhos.length; i++){
            int[] v = new int[vtamanhos[i]];
            preencher(v);
            long startTime = System.nanoTime();
            SelectionSort(v);
            long estimatedTime = System.nanoTime() - startTime;
            System.out.println("\nO tempo de execução: "+estimatedTime+"\n");
        }
    }
}
