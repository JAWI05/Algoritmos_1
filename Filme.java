import java.text.DecimalFormat;
import java.util.Random;

public class Filme {
    public static void main(String[] args){

        int u, f;
        Random r = new Random();
        u = r.nextInt(5);
        f = r.nextInt(5);

        int[][] matriz = new int[u][f];

    }

    public static void preencher(int m[][]){
        Random r = new Random();
        for (int u = 0; u < m.length; u++){
            for (int f = 0; f < m[u].length; f++){
                m[u][f] = r.nextInt(100);
            }
        }
    }

    public static void Imprimir(int m[][]){
        for (int u = 0; u < m.length; u++){
            for (int f = 0; f < m[u].length; f++){
                System.out.print(m[u][f] + "  ");
            }
            System.out.println();
        }
    }

    public static void MediaGeral (int m[][]){
        double soma = 0;
        int cont = 0;
        double media = 0;
        for (int u = 0; u < m.length; u++){
            for (int f = 0; f < m[u].length; f++){
                if (m[u][f] == 0){
                    break;
                }
                soma += m[u][f];
                cont++;
            }
        }
        media = soma/cont;
        DecimalFormat df = new DecimalFormat("0.00");
        String formatado = df.format(media);
        System.out.println(formatado);
    }

    public static double[] MediaUsuario (int m[][]){
        double somaLinha = 0;
        int cont = 0;
        double[] mediaLinha = new double[m.length];
        double media;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 0){
                    break;
                }
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

    public static double[] MediaFilme(int[][] m) {
        int colunas = m[0].length;
        int linhas = m.length;
        double[] medias = new double[colunas];

        for (int j = 0; j < colunas; j++) {
            double somaCol = 0;
            for (int i = 0; i < linhas; i++) {
                if (m[i][j] == 0){
                    break;
                }
                somaCol += m[i][j];
            }
            medias[j] = somaCol / linhas;
        }
        return medias;
    }

}
