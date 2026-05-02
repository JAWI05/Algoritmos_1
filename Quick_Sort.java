public class Quick_Sort {

    public static void QuickSort(int[] vetor, int inicio, int fim){
        if (inicio < fim){
            int meio = particionar(vetor, inicio, fim);
            QuickSort(vetor, inicio, meio-1);
            QuickSort(vetor, meio+1, fim);
        }
    }

    public static int particionar(int[] vetor, int inicio, int fim){
        int i = inicio+1;
        int j = fim;
        while (i <= j){
            if (vetor[i] < vetor[inicio]){
                i++;
            }
            else{
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

    public static void main(String[] args){
        int[] vetor = {5, 9, 20, 14, 3, 6};
        int fim = vetor.length-1;
        int inicio = 0;
        QuickSort(vetor, inicio, fim);
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
