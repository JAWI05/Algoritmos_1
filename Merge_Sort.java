public class Merge_Sort {

    public static void MergeSort(int[] vetor, int inicio, int fim){
        if (inicio < fim){
            int meio = (inicio+fim)/2;
            MergeSort(vetor, inicio, meio);
            MergeSort(vetor, meio+1, fim);
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
            else {
                vetor[k] = B[j];
                j--;
            }
        }
    }

    public static void main(String[] args){
        int[] vetor = {5, 9, 20, 14, 3, 6};
        int fim = vetor.length-1;
        int inicio = 0;

        MergeSort(vetor, inicio, fim);

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
