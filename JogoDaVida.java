public class JogoDaVida {

    public static void main(String[] args) {

        //n = tamanho da matriz
        int n = 3;
        //int[][] G = new int[n][n];
        int[][] G = { {1,0,0}, {0,0,1}, {1,0,0} }; // para teste
        //Numero de rodadas
        int T = 3;

        int[][] atual = G;
        for (int t = 0; t < T; t++) {
            atual = simularRodada(atual);
            //Caso queiram ver a cada rodada retire o comentário da linha abaixo
            //imprimirMatriz(atual);
        }

        System.out.println("Matriz final:");
        imprimirMatriz(atual);
        System.out.println("Existem " + contarCelulasVivas(G) + " células vivas na matriz.");

    }

    public static int contarVizinhos(int[][] atual, int posI, int posJ){
        int contadorVizinhos = 0;
        for(int ai = -1; ai <= 1; ai++){
            for (int aj = -1; aj <= 1; aj++){
                if( ai != 0 && aj !=0){ // Só faz senão for a própria célula
                    int ni = ai + posI;
                    int nj = aj + posJ;

                    //Esse if é para delimitar e ele não sair da matriz
                    if (ni >= 0 && ni < atual.length && nj >=0 && nj < atual.length){
                        contadorVizinhos += atual[ni][nj];
                    }
                }
            }
        }
        return contadorVizinhos;
    }

    public static int[][] simularRodada(int[][] atual){
        int[][] auxiliar = new int[atual.length][atual.length];

        for (int i = 0; i < atual.length; i++){
            for (int j = 0; j < atual[i].length; j++){
                int qtdeDeVizinhos = contarVizinhos(atual,i,j);

                if(atual[i][j] == 1){
                    if (qtdeDeVizinhos != 2 && qtdeDeVizinhos !=3){
                        auxiliar[i][j] = 0;
                    }else{
                        auxiliar[i][j] = 1;
                    }
                } else {
                    if (atual[i][j]==0){
                        if(qtdeDeVizinhos == 3){
                            auxiliar[i][j] = 1;
                        } else{
                            auxiliar[i][j] = 0;
                        }
                    }
                }
            }
        }
        return auxiliar;
    }


    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int contarCelulasVivas(int[][] matriz){
        int qtdeVivos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                qtdeVivos += matriz[i][j];
            }
        }
        return qtdeVivos;
    }


}
