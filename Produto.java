public abstract class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + "\n" +
                        "Preço Base: R$"+ precoBase + "\n" +
                        "Preço Final: R$"+calcularPrecoFinal() +"\n");
    }

    public abstract double calcularPrecoFinal();
}
