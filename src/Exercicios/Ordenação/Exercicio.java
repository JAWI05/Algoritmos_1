import java.util.ArrayList;
import java.util.Random;

public class Exercicio {

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

        for (int i: A) {
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


    public static int Conting_Sort(int[] A){
        int maior = encontrarMaior(A);
        int[] count = new int[maior+1];
        for (int i: A){
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


    public static void Bucket(int[] A, int digitoPos){
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

    public static void Radix_Sort(int[] A){
        int maior = encontrarMaior(A);
        for (int digitoPos = 1; maior/digitoPos > 0; digitoPos = digitoPos*10){
            Bucket(A, digitoPos);
        }
    }


    public static void preencher(int[] vetor, int tamanho){
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++){
            int randomNum = random.nextInt(0,tamanho);
            vetor[i] = randomNum;
        }
    }


    public static void main(String[] args){

        int[] tamanhos = {10, 100, 1000, 10000, 100000, 1000000};
        for (int i = 0; i < tamanhos.length; i++) {
            int[] vetor = new int[tamanhos[i]];
            int tamanho = tamanhos[i];
            preencher(vetor, tamanho);

            int[] Bucket = vetor.clone();
            int[] Counting = vetor.clone();
            int[] Radix = vetor.clone();

            System.out.println("Bucket Sort do vetor "+(i+1)+" com "+tamanho+" elementos");
            long inicio1 = System.nanoTime();
            if(tamanho >= 100000)
                Bucket_Sort(Bucket, 1000);
            else
                Bucket_Sort(Bucket, tamanho);
            long fim1 = System.nanoTime();
            long tempoTotal1 = fim1 - inicio1;
            System.out.println("Tempo em nanossegundos: " + tempoTotal1);
            System.out.println("Tempo em milissegundos: " + (tempoTotal1 / 1_000_000.0) + "\n");

            System.out.println("Counting Sort do vetor "+(i+1)+" com "+tamanho+" elementos");
            long inicio2 = System.nanoTime();
            Conting_Sort(Counting);
            long fim2 = System.nanoTime();
            long tempoTotal2 = fim2 - inicio2;
            System.out.println("Tempo em nanossegundos: " + tempoTotal2);
            System.out.println("Tempo em milissegundos: " + (tempoTotal2 / 1_000_000.0) + "\n");

            System.out.println("Radix Sort do vetor "+(i+1)+" com "+tamanho+" elementos");
            long inicio3 = System.nanoTime();
            Radix_Sort(Radix);
            long fim3 = System.nanoTime();
            long tempoTotal3 = fim3 - inicio3;
            System.out.println("Tempo em nanossegundos: " + tempoTotal3);
            System.out.println("Tempo em milissegundos: " + (tempoTotal3 / 1_000_000.0) + "\n");
        }
    }
}
