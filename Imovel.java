public class Imovel {

    String endereco;
    Tipo tipo;
    double valorAluguel;
    boolean disponivel;

    public enum Tipo {
        Casa, Apartamento
    }

    public Imovel(String endereco, Tipo tipo, double valorAluguel, boolean disponivel) {
        this.endereco = endereco;
        this.tipo = tipo;
        this.valorAluguel = valorAluguel;
        this.disponivel = disponivel;
    }

    public void alternarDisponibilidade() {
        this.disponivel = !this.disponivel;
        if(disponivel){
            System.out.println("Status do imóvel em " + endereco + " alterado para: Disponível");
        }
        else{
            System.out.println("Status do imóvel em " + endereco + " alterado para: Alugado");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void mostrar(){
        System.out.println("Imóvel: " +
                "\nEndereco: "+endereco+
                "\nTipo: "+tipo+
                "\nValor do aluguel: "+valorAluguel+
                "\nEstá disponível?: "+disponivel+"\n");
    }
}
