import java.util.ArrayList;

public class BucketSort {

    public static int encontrarMaior(int[] A){
        int maior = A[0];
        for (int i = 1; i < A.length; i++){
            if (A[i] > maior){
                maior = A[i];
            }
        }
        return maior;
    }

    public static void Bucket_Sort(int[] A, int numBuckets){
        if (A.length <= 0){
            return;
        }
        int max = encontrarMaior(A);

        ArrayList<Integer>[] buckets = new ArrayList[numBuckets];
        for (int i = 0; i < numBuckets; i++){
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < A.length; i++) {
            int bucketIndex = (int) Math.floor((A[i] * numBuckets) / (max + 1));
            buckets[bucketIndex].add(A[i]);
        }

        for (int i = 0; i < numBuckets; i++){
            Insertion_Sort(buckets[i]);
        }

        int pos = 0;
        for (int i = 0; i < numBuckets; i++){
            for (int elemento:buckets[i]){
                A[pos] = elemento;
                pos++;
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


    public static void main(String[] args){
        int[] vetor = {5, 9, 20, 14, 3, 6};
        Bucket_Sort(vetor, 6);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
