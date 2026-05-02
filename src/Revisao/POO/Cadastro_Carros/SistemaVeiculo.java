import java.util.ArrayList;
import java.util.Scanner;

public class SistemaVeiculo {
    private ArrayList<Carro> catalogo;
    private Scanner scanner;

    public SistemaVeiculo() {
        this.catalogo = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        executarMenu(); // Inicia o menu assim que o objeto é criado no Main
    }

    private void executarMenu() {
        int opcao;
        do {
            System.out.println("\n--- CADASTRO DE VEÍCULOS ---");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Listar Catálogo");
            System.out.println("3. Buscar por Marca");
            System.out.println("4. Remover Carro (por índice)");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> buscar();
                case 4 -> remover();
            }
        } while (opcao != 0);
    }

    private void cadastrar() {
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        catalogo.add(new Carro(modelo, marca, ano, preco));
        System.out.println("Veículo adicionado!");
    }

    private void listar() {
        if (catalogo.isEmpty()) {
            System.out.println("Catálogo vazio.");
            return;
        }
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println(i + " - " + catalogo.get(i));
        }
    }

    private void buscar() {
        System.out.print("Marca desejada: ");
        String busca = scanner.nextLine();
        catalogo.stream()
                .filter(c -> c.getMarca().equalsIgnoreCase(busca))
                .forEach(System.out::println);
    }

    private void remover() {
        listar();
        System.out.print("Índice para remover: ");
        int id = scanner.nextInt();
        if (id >= 0 && id < catalogo.size()) {
            catalogo.remove(id);
            System.out.println("Removido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
