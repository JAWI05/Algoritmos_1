class Serie extends Video {
    private int numeroTemporadas;

    public Serie(String titulo, int duracao, String genero, int numeroTemporadas) {
        super(titulo, duracao, genero);
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public void reproduzir() {
        System.out.println("Iniciando a série: " + titulo + " (" + numeroTemporadas + " temporadas)");
    }
}
