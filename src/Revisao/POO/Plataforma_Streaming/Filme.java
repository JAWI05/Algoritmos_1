public class Filme extends Video {
    private String diretor;

    public Filme(String titulo, int duracao, String genero, String diretor) {
        super(titulo, duracao, genero);
        this.diretor = diretor;
    }

    @Override
    public void reproduzir() {
        System.out.println("Iniciando o filme: " + titulo + " (Dirigido por " + diretor + ")");
    }
}
