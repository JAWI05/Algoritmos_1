public class Pix implements MetodoPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        return true;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pix: Pagamento de R$ "+valor+" processado sem taxas");
    }
}
