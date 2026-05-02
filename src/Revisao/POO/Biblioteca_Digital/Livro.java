public class Livro {
    private String titulo;
    private int anoPublicacao;
    private Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    @Override
    public String toString(){
        return "--------Livro--------"+
                "\nTítuolo: "+titulo+
                "\nAno de publicação: "+anoPublicacao+
                autor;
    }
}
