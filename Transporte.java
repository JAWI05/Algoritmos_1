public class Transporte {
    protected String passageiro;
    protected double distancia;

    public Transporte(String passageiro, double distancia) {
        this.passageiro = passageiro;
        this.distancia = distancia;
    }

    public double calcularTarifa() {
        return 0.0;
    }

    public void exibirDetalhes() {
        System.out.println("Passageiro: " + passageiro + "\n" +
                "Distância: "+ distancia+ "km \n" +
                "Tarifa: R$"+calcularTarifa() +"\n");
    }
}