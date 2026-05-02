import java.util.Arrays;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {

        int[][] m = new int[5][5];
        preencher(m);
        Imprimir(m);

        System.out.println("\nSoma de cada linha: "+Arrays.toString(SomaLinha(m)));
        System.out.println("\nSoma de cada coluna: "+Arrays.toString(SomaColuna(m)));

        System.out.println("\nÉ simétrica? " + ehSimetrica(m));

        System.out.println();
        int[][] t = Transposta(m);
        Imprimir(t);

        System.out.println();
        int[][] I = MatrizIdentidade(3);
        Imprimir(I);
    }

    public static void preencher(int m[][]) {
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = r.nextInt(100);
            }
        }
    }

    public static int[] SomaLinha(int m[][]) {
        int[] rowSum = new int[m.length];
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                soma += m[i][j];
            }
            rowSum[i] = soma;
            soma = 0;
        }
        return rowSum;
    }

    public static int[] SomaColuna(int m[][]) {
        int[] colSum = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++){
                colSum[j] = 0;
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                colSum[j] += m[i][j];
            }
        }
        return colSum;
    }

    public static boolean ehSimetrica(int[][] m) {
        if (m.length != m[0].length){
            return false;
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < i; j++) {
                if (m[i][j] != m[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] Transposta(int[][] A) {
        int[][] T = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }

    public static int[][] MatrizIdentidade(int n) {
        int[][] I = new int[n][n];
        for (int i = 0; i < n; i++) {
            I[i][i] = 1;
        }
        return I;
    }

    public static void Imprimir(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
