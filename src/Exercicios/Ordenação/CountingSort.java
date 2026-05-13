public class CountingSort {

    public static int encontrarMaior(int[] A){
        int maior = A[0];
        for (int i = 1; i < A.length; i++){
            if (A[i] > maior){
                maior = A[i];
            }
        }
        return maior;
    }

    public static int Conting_Sort(int[] A){
        int maior = encontrarMaior(A);
        int[] count = new int[maior+1];
        for (int i = 0; i < A.length; i++){
            count[A[i]] += 1;
        }
        int indice = 0;
        for (int i = 0; i < count.length; i++){
            while (count[i] > 0){
                A[indice] = i;
                indice++;
                count[i]--;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int[] vetor = {5, 9, 20, 14, 3, 6};
        Conting_Sort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
