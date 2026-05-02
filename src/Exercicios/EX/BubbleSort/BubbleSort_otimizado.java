public class BubbleSort_otimizado {

    public static void Bubble_Sort_otimizado(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (vetor[j - 1] > vetor[j]) {
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
        Bubble_Sort_otimizado(vetor);
    }
}
