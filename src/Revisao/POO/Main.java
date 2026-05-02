//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println();
            System.out.println("1. Gestão de Imóveis");
            System.out.println("2. Biblioteca Digital");
            System.out.println("3. Cadastro de Veículos");
            System.out.println("4. Sistema de Pedidos");
            System.out.println("5. Aplicativo de Transporte Urbano");
            System.out.println("6. Sistema de Pagamentos Online");
            System.out.println("7. Plataforma de Streaming de Vídeos");
            System.out.println("0. Sair do Programa");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            System.out.println("----------------------------------------");

            switch (opcao) {

                case 1:
                    Imovel imovel1 = new Imovel("Rua Alvaros", Imovel.Tipo.Apartamento, 1200, true);
                    Imovel imovel2 = new Imovel("Rua Falcão", Imovel.Tipo.Casa, 800, false);
                    Imovel imovel3 = new Imovel("Rua Nina", Imovel.Tipo.Casa, 650, true);
                    imovel3.alternarDisponibilidade();
                    imovel1.mostrar();
                    imovel2.mostrar();
                    imovel3.mostrar();
                    break;

                case 2:
                    Autor a1 = new Autor("Machado de Assis", "Brasileiro");
                    Autor a2 = new Autor("Edgar Allan Poe", "Americano");
                    Autor a3 = new Autor("Agatha Christie", "Inglês");

                    Livro l1 = new Livro("Dom Casmurro", 1899, a1);
                    Livro l2 = new Livro("Memórias Póstumas", 1881, a1);
                    Livro l3 = new Livro("O Gato Preto", 1843, a2);
                    Livro l4 = new Livro("Assassinato no Expresso do Oriente", 1934, a3);
                    Livro l5 = new Livro("E não sobrou nenhum", 1939, a3);

                    System.out.println(l1);
                    System.out.println(l2);
                    System.out.println(l3);
                    System.out.println(l4);
                    System.out.println(l5);
                    break;

                case 3:
                    SistemaVeiculo sist = new SistemaVeiculo();
                    break;

                case 4:
                    ArrayList<Produto> carrinho = new ArrayList<>();
                    carrinho.add(new Roupa("Camiseta Nike", 150.00));
                    carrinho.add(new Eletronico("Smartphone S24", 5000.00));
                    carrinho.add(new Roupa("Calça Jeans", 200.00));

                    for (Produto p : carrinho) {
                        p.exibirDetalhes();
                    }
                    System.out.println();
                    break;

                case 5:
                    ArrayList<Transporte> corridas = new ArrayList<>();

                    corridas.add(new CarroParticular("Ana", 10.5));
                    corridas.add(new Taxi("Bruno", 8.0));
                    corridas.add(new CarroParticular("Carlos", 5.2));
                    corridas.add(new Taxi("Daniela", 15.0));

                    for (Transporte t : corridas) {
                        t.exibirDetalhes();
                    }
                    break;

                case 6:
                    ArrayList<MetodoPagamento> pagamentos = new ArrayList<>();

                    pagamentos.add(new CartaoCredito());
                    pagamentos.add(new Pix());
                    pagamentos.add(new CartaoCredito());

                    double[] valores = {6000.0, 6000.0, 150.0};

                    for (int i = 0; i < pagamentos.size(); i++) {
                        pagamentos.get(i).processarPagamento(valores[i]);
                    }

                case 7:
                    Filme f1 = new Filme("O Diabo Veste Prada", 109, "Sci-Fi", "David Frankel");
                    Serie s1 = new Serie("Stranger Things", 50, "Terror", 4);
                    Filme f2 = new Filme("O Poderoso Chefão", 175, "Drama", "Francis Ford Coppola");

                    Usuario user = new Usuario("Gabriel", 25);

                    System.out.println("Ações do Usuário:");
                    user.assistirVideo(f1);
                    f1.avaliar(5);

                    user.assistirVideo(s1);
                    s1.avaliar(4);

                    user.mostrarHistorico();

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
