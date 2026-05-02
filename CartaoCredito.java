public class CartaoCredito implements MetodoPagamento {

    @Override
    public boolean autorizarPagamento(double valor) {
        return valor < 5000.00;
    }

    @Override
    public void processarPagamento(double valor) {
        if (autorizarPagamento(valor)) {
            double valorComTaxa = valor * 1.02; // Taxa de 2%
            System.out.println("Cartão de Crédito: Pagamento de R$ "+valor+" aprovado (Total com taxa: R$ "+valorComTaxa+")");
        } else {
            System.out.println("Cartão de Crédito: Pagamento de R$ "+valor+" recusado (Limite excedido)");
        }
    }
}