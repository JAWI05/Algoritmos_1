public interface MetodoPagamento {
    boolean autorizarPagamento(double valor);
    void processarPagamento(double valor);
}
