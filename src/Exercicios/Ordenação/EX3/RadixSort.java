import java.util.ArrayList;

public class RadixSort {

    public static int encontrarMaior(int[] A){
        int maior = A[0];
        for (int i = 1; i < A.length; i++){
            if (A[i] > maior){
                maior = A[i];
            }
        }
        return maior;
    }

    public static void Bucket_Sort(int[] A, int digitoPos){
        ArrayList<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < 10; i++){
            buckets[i] = new ArrayList<>();
        }
        for(int num:A){
            int digitoAtual = (num/ digitoPos) % 10;
            buckets[digitoAtual].add(num);
        }
        int index = 0;
        for (ArrayList<Integer>bucket:buckets){
            for (int num:bucket){
                A[index] = num;
                index++;
            }
        }
    }

    public static void Insertion_Sort(ArrayList<Integer> list){
        int n = list.size();
        for (int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && list.get(j-1) > list.get(j)){
                int aux = list.get(j);
                list.set(j,list.get(j-1));
                list.set(j-1, aux);
                j--;
            }
        }
    }


    public static void Radix_Sort(int[] A){
        int maior = encontrarMaior(A);
        for (int digitoPos = 1; maior/digitoPos > 0; digitoPos = digitoPos*10){
            Bucket_Sort(A, digitoPos);
        }
    }

    public static void main(String[] args){
        int[] vetor = {5, 9, 20, 14, 3, 6};

        Radix_Sort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
