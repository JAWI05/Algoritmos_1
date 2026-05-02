public class CarroParticular extends Transporte{
    public CarroParticular(String passageiro, double distancia) {
        super(passageiro, distancia);
    }

    @Override
    public double calcularTarifa() {
        return distancia * 2.50;
    }
}
