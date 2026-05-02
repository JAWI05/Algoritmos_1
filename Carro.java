public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    public Carro(String modelo, String marca, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public String toString(){
        return "\n--------Carro--------"+
                "\nModelo: "+modelo+
                "\nMarca: "+marca+
                "\nAno: "+ano+
                "\nPreço: "+preco+"\n";
    }
}
