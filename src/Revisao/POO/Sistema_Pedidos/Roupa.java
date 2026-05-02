public class Roupa extends Produto{
    public Roupa(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 0.90;
    }
}
