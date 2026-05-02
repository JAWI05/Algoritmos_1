public abstract class Video implements Avaliavel {
    protected String titulo;
    protected int duracao;
    protected String genero;
    protected int avaliacao; // Armazena a última nota dada

    public Video(String titulo, int duracao, String genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    public void exibirDetalhes() {
        System.out.println("Título: "+titulo+"\n"+
                "Gênero: "+genero +"\n"+
                "Duração: "+duracao+"\n"+
                "Nota: "+avaliacao+"\n");
    }

    public abstract void reproduzir();

    @Override
    public void avaliar(int nota) {
        this.avaliacao = nota;
    }
}