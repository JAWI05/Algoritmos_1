import java.util.Random;

public class EX_Merge_Quick_sort {
    public static void Quick_Sort(int[] vetor, int inicio, int fim){
        if (inicio < fim){
            int meio = particionar(vetor, inicio, fim);
            Quick_Sort(vetor, inicio, meio-1);
            Quick_Sort(vetor, meio+1, fim);
        }
    }

    public static int particionar(int[] vetor, int inicio, int fim){
        int i = inicio+1;
        int j = fim;
        while (i <= j){
            if (vetor[i] < vetor[inicio]){
                i++;
            }
            else {
                if (vetor[j] > vetor[inicio]){
                    j--;
                }
                else {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                    i++;
                    j--;
                }
            }
        }
        int aux = vetor[inicio];
        vetor[inicio] = vetor[j];
        vetor[j] = aux;
        return j;
    }

    public static void Merge_Sort(int[] vetor, int inicio, int fim){
        if (inicio < fim){
            int meio = (inicio+fim)/2;
            Merge_Sort(vetor, inicio, meio);
            Merge_Sort(vetor, meio+1, fim);
            intercala(vetor, inicio, meio, fim);
        }
    }

    public static void intercala(int[] vetor, int inicio, int meio, int fim){
        int[] B = new int[vetor.length];
        for (int i = inicio; i <= meio; i++){
            B[i] = vetor[i];
        }
        for (int j = meio+1; j <= fim; j++){
            B[fim+meio+1-j] = vetor[j];
        }
        int i = inicio;
        int j = fim;
        for (int k = inicio; k <= fim; k++){
            if (B[i] <= B[j]){
                vetor[k] = B[i];
                i++;
            }
            else{
                vetor[k] = B[j];
                j--;
            }
        }
    }

    public static void preencher(int[] vetor){
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++){
            int RandomNum = random.nextInt(100);
            vetor[i] = RandomNum;
        }
    }

    public static void main(String[] args){
        int[] tamanhos = {10, 100, 1000, 10000, 100000, 1000000};
        for (int i = 0; i < tamanhos.length; i++){
            int[] vetor = new int[tamanhos[i]];
            preencher(vetor);

            int[] Quick = vetor.clone();
            int[] Merge = vetor.clone();
            int inicio = 0;
            int fim = vetor.length-1;

            System.out.println("Quick sort do vetor "+(i+1)+" de tamanho "+tamanhos[i]);
            long inicio1 = System.nanoTime();
            Quick_Sort(Quick, inicio, fim);
            long fim1 = System.nanoTime();
            long tempoTotal1 = fim1 - inicio1;
            System.out.println("Tempo em nanossegundos "+tempoTotal1);
            System.out.println("Tempo em milissegundos "+(tempoTotal1/1_000_000.0) + "\n");

            System.out.println("Merge sort do vetor "+(i+1)+" de tamanho "+tamanhos[i]);
            long inicio2 = System.nanoTime();
            Merge_Sort(Merge, inicio, fim);
            long fim2 = System.nanoTime();
            long tempoTotal2 = fim2 - inicio2;
            System.out.println("Tempo em nanossegundos "+tempoTotal2);
            System.out.println("Tempo em milissegundos "+(tempoTotal2/1_000_000.0) + "\n");
        }
    }
}
