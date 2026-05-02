public class Eletronico extends Produto{
    public Eletronico(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 1.15;
    }
}
