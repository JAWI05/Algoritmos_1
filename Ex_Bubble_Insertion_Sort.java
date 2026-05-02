import java.util.Random;

public class Ex_Bubble_Insertion_Sort {

    public static void Bubble_sort(int[] vetor){
        int n = vetor.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (vetor[j-1] > vetor[j]) {
                    inverter(vetor, j-1, j);
                }
            }
        }
    }

    public static void Bubble_Sort_otimizado(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    inverter(vetor, j-1, j);
                }
            }
        }
    }

    public static void Insertion_sort(int[] vetor){
        int n = vetor.length;
        for (int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && vetor[j-1] > vetor[j]){
                inverter(vetor, j, j-1);
                j--;
            }
        }
    }

    public static void inverter(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }

    public static void preencher(int[] vetor){
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++){
            int randomNum = random.nextInt(100);
            vetor[i] = randomNum;
        }
    }

    public static void main(String[] args){
        int[] tamanhos = {10, 100, 1000, 10000, 100000, 1000000};
        for (int i = 0; i < tamanhos.length; i++){
            int[] v = new int[tamanhos[i]];
            preencher(v);

            int[] vBubble = v.clone();
            int[] vBubble_otim = v.clone();
            int[] vInsertion = v.clone();

            System.out.println("Bubble Sort do vetor "+(i+1));
            long inicio1 = System.nanoTime();
            Bubble_sort(vBubble);
            long fim1 = System.nanoTime();
            long tempoTotal1 = fim1 - inicio1;
            System.out.println("Tempo em nanossegundos: " + tempoTotal1);
            System.out.println("Tempo em milissegundos: " + (tempoTotal1 / 1_000_000.0) + "\n");

            System.out.println("Bubble Sort otimizado do vetor "+(i+1));
            long inicio2 = System.nanoTime();
            Bubble_Sort_otimizado(vBubble_otim);
            long fim2 = System.nanoTime();
            long tempoTotal2 = fim2 - inicio2;
            System.out.println("Tempo em nanossegundos: " + tempoTotal2);
            System.out.println("Tempo em milissegundos: " + (tempoTotal2 / 1_000_000.0) + "\n");

            System.out.println("Insertion Sort do vetor "+(i+1));
            long inicio3 = System.nanoTime();
            Insertion_sort(vInsertion);
            long fim3 = System.nanoTime();
            long tempoTotal3 = fim3 - inicio3;
            System.out.println("Tempo em nanossegundos: " + tempoTotal3);
            System.out.println("Tempo em milissegundos: " + (tempoTotal3 / 1_000_000.0) + "\n");
        }
    }
}
