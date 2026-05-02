public class Taxi extends Transporte{
    public Taxi(String passageiro, double distancia) {
        super(passageiro, distancia);
    }

    @Override
    public double calcularTarifa() {
        return (distancia * 3.00) + 5.00;
    }
}
