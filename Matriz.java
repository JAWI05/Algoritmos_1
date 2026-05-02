import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Matriz {
    public static void main(String[] args) {

        int m, n;
        Random numAleat = new Random();
        m = numAleat.nextInt(99) + 1;
        n = numAleat.nextInt(99) + 1;

        int U[][] = new int[m][n];

        preencher(U);

        Imprimir(U);

        System.out.println();
        MediaGeral(U);

        System.out.println("Media de cada linha: " + Arrays.toString(MediaLinha(U)));
        System.out.println("Media de cada coluna: " + Arrays.toString(MediaColuna(U)));

        System.out.println();
        menorValor(U);

        System.out.println();
        int limite = 35;
        int alertas = quantSensoresAlerta(U, limite);
        System.out.println("Total de sensores abaixo do limite (" + limite + "): " + alertas);
    }

    public static void preencher(int m[][]){
        Random r = new Random();
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = r.nextInt(100);
            }
        }
    }

    public static void Imprimir(int m[][]){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void MediaGeral (int m[][]){
        double soma = 0;
        int cont = 0;
        double media = 0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                soma += m[i][j];
                cont++;
            }
        }
        media = soma/cont;
        DecimalFormat df = new DecimalFormat("0.00");
        String formatado = df.format(media);
        System.out.println(formatado);
    }

    public static double[] MediaLinha (int m[][]){
        double somaLinha = 0;
        int cont = 0;
        double[] mediaLinha = new double[m.length];
        double media;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                somaLinha += m[i][j];
                cont++;
            }
            media = somaLinha/cont;
            DecimalFormat df = new DecimalFormat("0.00");
            String formatado = df.format(media);
            mediaLinha[i] = media;
            somaLinha = 0;
            cont = 0;
        }

        return mediaLinha;
    }

    public static double[] MediaColuna(int[][] m) {
        int colunas = m[0].length;
        int linhas = m.length;
        double[] medias = new double[colunas];

        for (int j = 0; j < colunas; j++) {
            double somaCol = 0;
            for (int i = 0; i < linhas; i++) {
                somaCol += m[i][j];
            }
            medias[j] = somaCol / linhas;
        }
        return medias;
    }

    public static void menorValor(int[][] m){
        int menor = 999;
        int posi = 0, posj = 0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                if (m[i][j] < menor){
                    menor = m[i][j];
                    posi = i;
                    posj = j;
                }
            }
        }
        System.out.println("Posição ("+posi+" ,"+posj+")");
        System.out.println(menor);
    }

    public static int quantSensoresAlerta(int[][] m, int L) {
        int contador = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < L) {
                    contador++;
                }
            }
        }

        return contador;
    }
}
