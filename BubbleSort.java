public class BubbleSort {

    public static void Bubble_Sort(int[] vetor){
        int n = vetor.length;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (vetor[j-1] > vetor[j]) {
                    int aux = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(vetor[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] vetor = {5, 9, 20, 14, 3, 6};
        Bubble_Sort(vetor);
    }
}
