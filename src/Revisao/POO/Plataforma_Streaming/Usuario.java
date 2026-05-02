import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int idade;
    private ArrayList<Video> historico;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.historico = new ArrayList<>();
    }

    public void assistirVideo(Video v) {
        v.reproduzir();
        historico.add(v);
    }

    public void mostrarHistorico() {
        System.out.println("\n--- Histórico de " + nome + " ---");
        if (historico.isEmpty()) {
            System.out.println("Nenhum vídeo assistido ainda.");
        } else {
            for (Video v : historico) {
                v.exibirDetalhes();
            }
        }
    }
}
