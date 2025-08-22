package imobiliaria;

import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private ImovelDAO imovelDAO;
    private ClienteDAO clienteDAO;
    private ContratoDAO contratoDAO;

    public Menu(Scanner sc) {
        this.sc = sc;
        this.imovelDAO = new ImovelDAO();
        this.clienteDAO = new ClienteDAO();
        this.contratoDAO = new ContratoDAO();
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n===== Sistema Imobiliária =====");
            System.out.println("1. Cadastrar Imóvel");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Cadastrar Contrato");
            System.out.println("4. Relatórios");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> imovelDAO.cadastrar(sc);
                case 2 -> clienteDAO.cadastrar(sc);
                case 3 -> contratoDAO.cadastrar(sc);
                case 4 -> mostrarRelatorios();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void mostrarRelatorios() {
        int opcao;
        do {
            System.out.println("\n===== Relatórios =====");
            System.out.println("1. Imóveis disponíveis");
            System.out.println("2. Contratos ativos");
            System.out.println("3. Clientes com mais contratos");
            System.out.println("4. Contratos expirando em 30 dias");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> imovelDAO.listarDisponiveis();
                case 2 -> contratoDAO.listarAtivos();
                case 3 -> clienteDAO.clientesComMaisContratos();
                case 4 -> contratoDAO.contratosExpirando();
                case 0 -> {}
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
