public class InsertionSort {

    public static void Insertion_Sort(int[] vetor){
        int n = vetor.length;
        for (int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && vetor[j-1] > vetor[j]){
                int aux = vetor[j];
                vetor[j] = vetor[j-1];
                vetor[j-1] = aux;
                j--;
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(vetor[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] vetor = {5, 9, 20, 14, 3, 6};
        Insertion_Sort(vetor);
    }
}
