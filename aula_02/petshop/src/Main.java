import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PetShop petShop = new PetShop();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n=== PETSHOP ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Cao");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Listar Caes");
            System.out.println("5 - Excluir Cliente");
            System.out.println("6 - Excluir Cao");
            System.out.println("7 - Calcular Servico");
            System.out.println("8 - Agendar Servico");
            System.out.println("9 - Ver Agenda");
            System.out.println("10 - Cancelar Agendamento");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("CPF:");
                    String cpf = sc.nextLine();

                    System.out.println("Nome:");
                    String nome = sc.nextLine();

                    System.out.println("Idade:");
                    int idade = sc.nextInt();

                    Cliente cliente = new Cliente(cpf, nome, idade);

                    petShop.adicionarCliente(cliente);

                    System.out.println("Cliente cadastrado!");
                    break;

                case 2:

                    System.out.println("Chip do Cao:");
                    String chip = sc.nextLine();

                    System.out.println("Nome do Cao:");
                    String nomeCao = sc.nextLine();

                    System.out.println("Idade:");
                    int idadeCao = sc.nextInt();
                    sc.nextLine();

                    System.out.println("CPF do dono:");
                    String cpfDono = sc.nextLine();

                    Cao cao = new Cao(chip, nomeCao, idadeCao, cpfDono);

                    petShop.adicionarCao(cao);

                    System.out.println("Cao cadastrado!");
                    break;

                case 3:

                    petShop.listarClientes();

                    break;

                case 4:

                    petShop.listarCaes();

                    break;

                case 5:

                    System.out.println("CPF do cliente:");
                    String cpfRemover = sc.nextLine();

                    if (petShop.removerCliente(cpfRemover)) {
                        System.out.println("Cliente removido!");
                    } else {
                        System.out.println("Cliente nao encontrado!");
                    }

                    break;

                case 6:

                    System.out.println("Chip do cao:");
                    String chipRemover = sc.nextLine();

                    if (petShop.removerCao(chipRemover)) {
                        System.out.println("Cao removido!");
                    } else {
                        System.out.println("Cao nao encontrado!");
                    }

                    break;

                case 7:

                    System.out.println("Servico:");
                    System.out.println("1 - Banho");
                    System.out.println("2 - Tosa");
                    System.out.println("3 - Banho + Tosa");

                    int servico = sc.nextInt();

                    System.out.println("Tamanho do cao:");
                    System.out.println("1 - Pequeno");
                    System.out.println("2 - Medio");
                    System.out.println("3 - Grande");

                    int tamanho = sc.nextInt();

                    double valor = petShop.calcularServico(servico, tamanho);

                    System.out.println("Valor do servico: R$ " + valor);

                    break;

                case 8:

                    sc.nextLine();

                    System.out.println("Chip do cao:");
                    String chipAg = sc.nextLine();

                    System.out.println("Servico (Banho / Tosa / Banho+Tosa):");
                    String servAg = sc.nextLine();

                    System.out.println("Horario:");
                    String horario = sc.nextLine();

                    if (petShop.agendarServico(chipAg, servAg, horario)) {
                        System.out.println("Agendamento realizado!");
                    } else {
                        System.out.println("Horario ocupado!");
                    }

                    break;

                case 9:

                    petShop.verAgenda();

                    break;

                case 10:

                    System.out.println("Chip do cao:");
                    String chipCancel = sc.nextLine();

                    if (petShop.cancelarAgendamento(chipCancel)) {
                        System.out.println("Agendamento cancelado!");
                    } else {
                        System.out.println("Agendamento nao encontrado!");
                    }

                    break;

                case 0:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opcao invalida!");

            }

        }

        sc.close();

    }

}